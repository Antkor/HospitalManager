import java.sql.*;
import java.util.ArrayList;

public class DbConnector {
	
	private Connection conn;
	private Statement st;
	ResultSet rs;
	
	private void openConnection() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");			
			st = conn.createStatement();
		}
		catch (Exception e) {
			
		}
	}
	
	private void closeConnection() {
		try {
			if (rs != null) {
				rs.close();
			}
			
			if (st != null) {
				st.close();
			}
			
			if (conn != null) {
				conn.close();
			}
		}
		catch (Exception e) {
			
		}
	}

	public ArrayList<Patient> getAllPatients() {
		ArrayList<Patient> patients = new ArrayList<Patient>();
		try {		
			ResultSet rs = st.executeQuery("select * from patient");
			
			while(rs.next()) {
				Patient p = new Patient(" ", " ", " ", " ", " ", " ", " ", " ", " ", " ");
				patients.add(p);
				System.out.println("Onoma: " + rs.getString("name") + " Epitheto: " + rs.getString("surname") + " Asfaleia: " + rs.getString("insurance")
				+ " Tilefono: " + rs.getString("telephone") + "\n Pathisi: " + rs.getString("notes"));
			}
		}
		catch (Exception e) {
			
		}
		return null;
	}

}
