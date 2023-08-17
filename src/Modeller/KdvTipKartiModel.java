package Modeller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Commandler.DbHelper2;

public class KdvTipKartiModel {
	private int ktId;
	private String ktKodu;
	private String ktAdi;
	private double ktOrani;
	
	
	//constructor
	public KdvTipKartiModel(int ktId, String ktKodu, String ktAdi, double ktOrani) {
		super();
		this.ktId = ktId;
		this.ktKodu = ktKodu;
		this.ktAdi = ktAdi;
		this.ktOrani = ktOrani;
		
		
	}
	
	
	
	public KdvTipKartiModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	// insert metodu 
	
	public void insert() {
		
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		try {
		
			String query = "insert into kdvtipkart(ktKodu, ktAdi, ktOrani) values(?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, getKtKodu());
			stmt.setString(2, getKtAdi());
			stmt.setObject(3, getKtOrani());
			stmt.executeUpdate();
			stmt.close();
		

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	
	
	//update metodu

	public void update() {
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		try {
			String query = "update kdvtipkart set ktAdi=?, ktOrani=? where ktKodu=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, getKtAdi());
			stmt.setObject(2, getKtOrani());
			stmt.setObject(3, getKtKodu());
			
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	//delete metodu 
	
	public void delete() {
		
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		String query = "delete from kdvtipkart where ktKodu=?";

		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, getKtKodu());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	

	
	
	
	
	
	
	// ilk veri çekme 
	
	public void ilkVeri() {
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		String query = "select * from kdvtipkart order by ktId limit 1";
		
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				setKtId(rs.getInt("ktId"));
				setKtKodu(rs.getString("ktKodu"));
				setKtAdi(rs.getString("ktAdi"));
				setKtOrani(rs.getDouble("ktOrani"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	//son veriyi çekme 
	
	public void sonVeri() {
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		String query = "select * from kdvtipkart order by ktId desc limit 1";
		
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				setKtId(rs.getInt("ktId"));
				setKtKodu(rs.getString("ktKodu"));
				setKtAdi(rs.getString("ktAdi"));
				setKtOrani(rs.getDouble("ktOrani"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	//ileri 
	
	public void ileri() {
		
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}		
		
		if (getKtKodu().equals("")) {
			ilkVeri();
		}
		else {
			try {
				String q = "select * from kdvtipkart where ktKodu = ?";
				PreparedStatement stmt2 = con.prepareStatement(q);
				stmt2.setString(1, getKtKodu());
				ResultSet rs2 = stmt2.executeQuery();
				while(rs2.next()) {
					setKtId(rs2.getInt("ktId"));  //aşağıdaki sorgu için sadece id yi set etsem yeterli
					setKtKodu(rs2.getString("ktKodu"));
					setKtAdi(rs2.getString("ktAdi"));
					setKtOrani(rs2.getDouble("ktOrani")); //kalanlar ise en başa geldiğinde ilerleyememesi için
				}	
				
				String query = "select * from kdvtipkart where ktId > ? order by ktId limit 1";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, String.valueOf(getKtId()));
				ResultSet rs = stmt.executeQuery();

				while(rs.next()) {
					setKtId(rs.getInt("ktId"));
					setKtKodu(rs.getString("ktKodu"));
					setKtAdi(rs.getString("ktAdi"));
					setKtOrani(rs.getDouble("ktOrani"));
				}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	// geri
	
	public void geri() {
			
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}		
		
		if (getKtKodu().equals("")) {
			sonVeri();
		}
		else {
			try {
				String q = "select * from kdvtipkart where ktKodu = ?";
				PreparedStatement stmt2 = con.prepareStatement(q);
				stmt2.setString(1, getKtKodu());
				ResultSet rs2 = stmt2.executeQuery();
				while(rs2.next()) {
					setKtId(rs2.getInt("ktId"));  //aşağıdaki sorgu için sadece id yi set etsem yeterli
					setKtKodu(rs2.getString("ktKodu"));
					setKtAdi(rs2.getString("ktAdi"));
					setKtOrani(rs2.getDouble("ktOrani")); //kalanlar ise en başa geldiğinde ilerleyememesi için
				}	
				
				String query = "select * from kdvtipkart where ktId < ? order by ktId desc limit 1";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, String.valueOf(getKtId()));
				ResultSet rs = stmt.executeQuery();

				while(rs.next()) {
					setKtId(rs.getInt("ktId"));
					setKtKodu(rs.getString("ktKodu"));
					setKtAdi(rs.getString("ktAdi"));
					setKtOrani(rs.getDouble("ktOrani"));
				}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
		
		
	
	
	
	
	
	
	//recorded metodu
	
	public boolean isRecorded() {
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		ArrayList<String> recordedList = new ArrayList<>();
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select ktKodu from kdvtipkart");
			while (rs.next()) {
				recordedList.add(rs.getString("ktKodu"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (String i : recordedList) {
			if (i.equals(getKtKodu())) {
				return true;
			}   
		}
		return false;
	}
	
	
	
	
	
	
	
	//setters and getters
	
	public int getKtId() {
		return ktId;
	}



	public void setKtId(int ktId) {
		this.ktId = ktId;
	}



	public String getKtKodu() {
		return ktKodu;
	}



	public void setKtKodu(String ktKodu) {
		this.ktKodu = ktKodu;
	}



	public String getKtAdi() {
		return ktAdi;
	}



	public void setKtAdi(String ktAdi) {
		this.ktAdi = ktAdi;
	}



	public double getKtOrani() {
		return ktOrani;
	}



	public void setKtOrani(double ktOrani) {
		this.ktOrani = ktOrani;
	}
	
}
