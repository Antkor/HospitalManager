import java.util.ArrayList;

public class AppointmentList {

	public static ArrayList<Appointment> getAppointments() {
		DbConnector connector = new DbConnector();
		return connector.getAllAppointments();
	}
}
