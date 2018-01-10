import java.util.ArrayList;

public class PatientList {
	
	public static ArrayList<Patient> getPatients() {
		return Connector.getpatients();
	}

}
