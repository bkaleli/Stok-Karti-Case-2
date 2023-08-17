package Modeller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Commandler.DbHelper2;

public class StokTipKartiModel {
	private int stId;
	private String stKodu;
	private String stAdi;
	private String stAciklama;
	
	
	
	
	//constructor
	public StokTipKartiModel(int stId, String stKodu, String stAdi, String stAciklama) {
		super();
		this.stId = stId;
		this.stKodu = stKodu;
		this.stAdi = stAdi;
		this.stAciklama = stAciklama;
	}
	
	
	
	
	public StokTipKartiModel() {
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
		
			String query = "insert into stoktipkart(stKodu, stAdi, stAciklama) values(?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			
			stmt.setString(1, getStKodu());
			stmt.setString(2, getStAdi());
			stmt.setObject(3, getStAciklama());
			stmt.executeUpdate();
			stmt.close();
		

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			con.close();
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
			String query = "update stoktipkart set stAdi=?, stAciklama=? where stKodu=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, getStAdi());
			stmt.setObject(2, getStAciklama());
			stmt.setObject(3, getStKodu());
			
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
		String query = "delete from stoktipkart where stKodu=?";

		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, getStKodu());
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	
	
	
	
	//ilk veriyi çekme 
	public void ilkVeri() {
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		String query = "select * from stoktipkart order by stId limit 1";
		
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				setStId(rs.getInt("stId"));
				setStKodu(rs.getString("stKodu"));
				setStAdi(rs.getString("stAdi"));
				setStAciklama(rs.getString("stAciklama"));
				
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

		String query = "select * from stoktipkart order by stId desc limit 1";
		
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				setStId(rs.getInt("stId"));
				setStKodu(rs.getString("stKodu"));
				setStAdi(rs.getString("stAdi"));
				setStAciklama(rs.getString("stAciklama"));
				
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
		
		if (getStKodu().equals("")) {
			ilkVeri();
		}
		else {
			try {
				String q = "select * from stoktipkart where stKodu = ?";
				PreparedStatement stmt2 = con.prepareStatement(q);
				stmt2.setString(1, getStKodu());
				ResultSet rs2 = stmt2.executeQuery();
				while(rs2.next()) {
					setStId(rs2.getInt("stId"));  //aşağıdaki sorgu için sadece id yi set etsem yeterli
					setStKodu(rs2.getString("stKodu"));
					setStAdi(rs2.getString("stAdi"));
					setStAciklama(rs2.getString("stAciklama")); //kalanlar ise en başa geldiğinde ilerleyememesi için
				}	
				
				String query = "select * from stoktipkart where stId > ? order by stId limit 1";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, String.valueOf(getStId()));
				ResultSet rs = stmt.executeQuery();

				while(rs.next()) {
					setStId(rs.getInt("stId"));
					setStKodu(rs.getString("stKodu"));
					setStAdi(rs.getString("stAdi"));
					setStAciklama(rs.getString("stAciklama"));
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
	
	if (getStKodu().equals("")) {
		ilkVeri();
	}
	else {
		try {
			String q = "select * from stoktipkart where stKodu = ?";
			PreparedStatement stmt2 = con.prepareStatement(q);
			stmt2.setString(1, getStKodu());
			ResultSet rs2 = stmt2.executeQuery();
			while(rs2.next()) {
				setStId(rs2.getInt("stId"));  //aşağıdaki sorgu için sadece id yi set etsem yeterli
				setStKodu(rs2.getString("stKodu"));
				setStAdi(rs2.getString("stAdi"));
				setStAciklama(rs2.getString("stAciklama")); //kalanlar ise en başa geldiğinde ilerleyememesi için
			}	
			
			String query = "select * from stoktipkart where stId < ? order by stId desc limit 1";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, String.valueOf(getStId()));
			ResultSet rs = stmt.executeQuery();

			while(rs.next()) {
				setStId(rs.getInt("stId"));
				setStKodu(rs.getString("stKodu"));
				setStAdi(rs.getString("stAdi"));
				setStAciklama(rs.getString("stAciklama"));
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
		ResultSet rs = stmt.executeQuery("select stKodu from stoktipkart");
		while (rs.next()) {
			recordedList.add(rs.getString("stKodu"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	for (String i : recordedList) {
		if (i.equals(getStKodu())) {
			return true;
		}   
	}
	return false;
}





	

	//setters and getters
	public int getStId() {
		return stId;
	}


	public void setStId(int stId) {
		this.stId = stId;
	}


	public String getStKodu() {
		return stKodu;
	}


	public void setStKodu(String stKodu) {
		this.stKodu = stKodu;
	}


	public String getStAdi() {
		return stAdi;
	}


	public void setStAdi(String stAdi) {
		this.stAdi = stAdi;
	}


	public String getStAciklama() {
		return stAciklama;
	}


	public void setStAciklama(String stAciklama) {
		this.stAciklama = stAciklama;
	}
	
	
	
	
	
	
}
