import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTable;

public class AppointmentList_GUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */

			public static void run() {
				try {
					AppointmentList_GUI window = new AppointmentList_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}


	/**
	 * Create the application.
	 */
	public AppointmentList_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u039B\u03AF\u03C3\u03C4\u03B1 \u0395\u03C0\u03B9\u03C3\u03BA\u03AD\u03C8\u03B5\u03C9\u03BD");
		frame.setBounds(100, 100, 517, 300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 11, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		table = new JTable();
		table.setBounds(10, 45, 481, 205);
		frame.getContentPane().add(table);
	}
	
	private void loadTable() {
		ArrayList<Appointment> Apps = new ArrayList<Appointment>();
		Apps = AppointmentList.getAppointments();
		for (int i = 0; i < Apps.size(); i++){
			String amka = Apps.get(i).getAmkaPatient();
			String ln = Apps.get(i).getArMitrwoyDoctor();
			String fn = patients.get(i).getFirstname();
			String address = patients.get(i).getAddress();
			String ph = patients.get(i).getTelephone();
			String Email = patients.get(i).getEmail();
			int age = patients.get(i).getAge();
			String sex = patients.get(i).getGender();
			String blood = patients.get(i).getBloodType();
			String info = patients.get(i).getInfo();
			
			Object[] data = {amka, ln, fn, address, ph, Email, 
	                age, sex, blood, info};
			
			tableModel.addRow(data);
					
		}

}
}
