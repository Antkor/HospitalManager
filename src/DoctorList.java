import java.util.ArrayList;

public class DoctorList {

	public static ArrayList<Doctor> getDoctors() {
		DbConnector connector = new DbConnector();
		return connector.getAllDoctors();
	}
}
