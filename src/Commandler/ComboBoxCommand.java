package Commandler;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Frameler.StokKartiFrame;

public class ComboBoxCommand {
	
	
	
	// stok tipi combobox 
	public void comboBoxStokTipi(StokKartiFrame stokKartiFrame) {
		ArrayList<Integer> liste = new ArrayList<>();
		
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select stId from stoktipkart");
			
			while (rs.next()) {
				liste.add(rs.getInt("stId"));
				
			}
			
			for (int i: liste) {
				stokKartiFrame.cbStokTipi.addItem(i);

			}
			stmt.close();
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	// kdv tipi combobox
	public void comboBoxKdvTipi(StokKartiFrame stokKartiFrame) {
		ArrayList<Double> liste = new ArrayList<>();
		
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select ktOrani from kdvtipkart");
			
			while (rs.next()) {
				liste.add(rs.getDouble("ktOrani"));
				
			}
			
			for (double i: liste) {
				stokKartiFrame.cbKdvTipi.addItem(i);

			}
			stmt.close();
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
}
