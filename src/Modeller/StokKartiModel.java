package Modeller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Commandler.DbHelper2;

public class StokKartiModel {
	
	private String stokKodu;
	private String stokAdı;
	private int stokTipi;
	private String birimi;
	private String barkodu;
	private double kdvTipi;
	private String acıklama;
	private String olusturmaTarihi;
	
	
	
	//constructor
	
	public StokKartiModel(String stokKodu, String stokAdı, int stokTipi, String birimi, String barkodu, double kdvTipi,
			String acıklama, String olusturmaTarihi) {
		this.stokKodu = stokKodu;
		this.stokAdı = stokAdı;
		this.stokTipi = stokTipi;
		this.birimi = birimi;
		this.barkodu = barkodu;
		this.kdvTipi = kdvTipi;
		this.acıklama = acıklama;
		this.olusturmaTarihi = olusturmaTarihi;
	}	
	
	
	
	
	public StokKartiModel() {
		super();
		// TODO Auto-generated constructor stub
	}



	
	
	//insert metodu
	
	public void insert() {
		
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}

		try {
			String query = "insert into stokkart() values(?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, getStokKodu());
			stmt.setString(2, getStokAdı());
			stmt.setObject(3, getStokTipi());
			stmt.setObject(4, getBirimi());
			stmt.setObject(5, getBarkodu());
			stmt.setObject(6, getKdvTipi());
			stmt.setString(7, getAcıklama());
			stmt.setString(8, getOlusturmaTarihi());
			stmt.executeUpdate();
			stmt.close();
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	

	
	
	// update metodu
	public void update() {
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			e2.printStackTrace();
		}
		try {
			String query = "update stokkart set stokAdı=?, stokTipi=?, birimi=?, barkodu=?, kdvTipi=?, acıklama=?, olusturmaTarihi=? where stokKodu=?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, getStokAdı());
			stmt.setObject(2, getStokTipi());
			stmt.setObject(3, getBirimi());
			stmt.setObject(4, getBarkodu());
			stmt.setObject(5, getKdvTipi());
			stmt.setString(6, getAcıklama());
			stmt.setString(7, getOlusturmaTarihi());
			stmt.setString(8, getStokKodu());
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
		String query = "delete from stokkart where stokKodu=?";

		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, getStokKodu());
			stmt.executeUpdate();
			stmt.close();
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

		String query = "select * from stokkart order by stokKodu limit 1";
		
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				setStokKodu(rs.getString("stokKodu"));
				setStokAdı(rs.getString("stokAdı"));
				setStokTipi(rs.getInt("stokTipi"));
				setBirimi(rs.getString("birimi"));
				setBarkodu(rs.getString("barkodu"));
				setKdvTipi(rs.getDouble("kdvTipi"));
				setAcıklama(rs.getString("acıklama"));
				setOlusturmaTarihi(rs.getString("olusturmaTarihi"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	// son veriyi çekme 
	
	public void sonVeri() {
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		String query = "select * from stokkart order by stokKodu desc limit 1";
		
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				setStokKodu(rs.getString("stokKodu"));
				setStokAdı(rs.getString("stokAdı"));
				setStokTipi(rs.getInt("stokTipi"));
				setBirimi(rs.getString("birimi"));
				setBarkodu(rs.getString("barkodu"));
				setKdvTipi(rs.getDouble("kdvTipi"));
				setAcıklama(rs.getString("acıklama"));
				setOlusturmaTarihi(rs.getString("olusturmaTarihi"));
				
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
		
		if (getStokKodu().equals("")) {
			ilkVeri();
		}
		else {
			try {
				String query = "select * from stokkart where stokKodu > ? order by stokKodu limit 1";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, getStokKodu());
				ResultSet rs = stmt.executeQuery();

				while(rs.next()) {
					setStokKodu(rs.getString("stokKodu"));
					setStokAdı(rs.getString("stokAdı"));
					setStokTipi(rs.getInt("stokTipi"));
					setBirimi(rs.getString("birimi"));
					setBarkodu(rs.getString("barkodu"));
					setKdvTipi(rs.getDouble("kdvTipi"));
					setAcıklama(rs.getString("acıklama"));
					setOlusturmaTarihi(rs.getString("olusturmaTarihi"));
				}	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	//geri
	
	public void geri() {
		Connection con= null;
		DbHelper2 helper = new DbHelper2();
		try {
			con = helper.getConnection();
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}		
		
		if (getStokKodu().equals("")) {
			sonVeri();
		}
		else {
			try {

				String query = "select * from stokkart where stokkodu < ? order by stokKodu desc limit 1";
				PreparedStatement stmt = con.prepareStatement(query);
				stmt.setString(1, getStokKodu());
				ResultSet rs = stmt.executeQuery();

				while(rs.next()) {
					setStokKodu(rs.getString("stokKodu"));
					setStokAdı(rs.getString("stokAdı"));
					setStokTipi(rs.getInt("stokTipi"));
					setBirimi(rs.getString("birimi"));
					setBarkodu(rs.getString("barkodu"));
					setKdvTipi(rs.getDouble("kdvTipi"));
					setAcıklama(rs.getString("acıklama"));
					setOlusturmaTarihi(rs.getString("olusturmaTarihi"));
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
			ResultSet rs = stmt.executeQuery("select stokkodu from stokkart");
			while (rs.next()) {
				recordedList.add(rs.getString("stokkodu"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for (String i : recordedList) {
			if (i.equals(getStokKodu())) {
				return true;
			}   
		}
		return false;
	}


	
	
		
	
	
	
	
	
	//getters and setters
	
	
	public String getStokAdı() {
		return stokAdı;
	}
	public void setStokAdı(String stokAdı) {
		this.stokAdı = stokAdı;
	}
	public int getStokTipi() {
		return stokTipi;
	}
	public void setStokTipi(int stokTipi) {
		this.stokTipi = stokTipi;
	}
	public String getBirimi() {
		return birimi;
	}
	public void setBirimi(String birimi) {
		this.birimi = birimi;
	}
	public String getBarkodu() {
		return barkodu;
	}
	public void setBarkodu(String barkodu) {
		this.barkodu = barkodu;
	}
	public double getKdvTipi() {
		return kdvTipi;
	}
	public void setKdvTipi(double kdvTipi) {
		this.kdvTipi = kdvTipi;
	}
	public String getAcıklama() {
		return acıklama;
	}
	public void setAcıklama(String acıklama) {
		this.acıklama = acıklama;
	}
	public String getOlusturmaTarihi() {
		return olusturmaTarihi;
	}
	public void setOlusturmaTarihi(String olusturmaTarihi) {
		this.olusturmaTarihi = olusturmaTarihi;
	}
	public String getStokKodu() {
		return stokKodu;
	}
	public void setStokKodu(String stokKodu) {
		this.stokKodu = stokKodu;
	}
	
	
}
