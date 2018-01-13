import java.util.ArrayList;

public class PatientList {
	
	public static ArrayList<Patient> getPatients() {
		DbConnector connector = new DbConnector();
		return connector.getAllPatients();
	}

}
