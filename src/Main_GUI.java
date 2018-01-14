import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Main_GUI {

	private JFrame frmHospitalManager;
	private Image image;

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_GUI window = new Main_GUI();
					window.frmHospitalManager.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		image = new ImageIcon(this.getClass().getResource("/HospMan.jpg")).getImage();
		
		frmHospitalManager = new JFrame();
		frmHospitalManager.setTitle("Hospital Manager");
		frmHospitalManager.setBounds(100, 100, 642, 300);
		frmHospitalManager.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmHospitalManager.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Επιλογές", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(16, 11, 173, 222);
		frmHospitalManager.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btn_patient = new JButton("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7 \u0391\u03C3\u03B8\u03B5\u03BD\u03CE\u03BD");
		btn_patient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
            Patient_GUI.run();
				
			}
		});
		btn_patient.setBounds(6, 16, 161, 23);
		panel.add(btn_patient);
		
		JButton btn_App = new JButton("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7 \u0395\u03C0\u03B9\u03C3\u03BA\u03AD\u03C8\u03B5\u03C9\u03BD");
		btn_App.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Appointment_GUI.run();
			}
		});
		btn_App.setBounds(6, 50, 161, 23);
		panel.add(btn_App);
		
		JButton btn_Doctor = new JButton("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7 \u0399\u03B1\u03C4\u03C1\u03CE\u03BD");
		btn_Doctor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Doctor_GUI.run();
			}
		});
		btn_Doctor.setBounds(6, 84, 161, 23);
		panel.add(btn_Doctor);
		
		JButton btn_PattientList = new JButton("\u039B\u03AF\u03C3\u03C4\u03B1 \u0391\u03C3\u03B8\u03B5\u03BD\u03CE\u03BD");
		btn_PattientList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientList_GUI.run();
			}
		});
		btn_PattientList.setBounds(6, 118, 161, 23);
		panel.add(btn_PattientList);
		
		JButton btn_AppList = new JButton("\u039B\u03AF\u03C3\u03C4\u03B1 \u0395\u03C0\u03B9\u03C3\u03BA\u03AD\u03C8\u03B5\u03C9\u03BD");
		btn_AppList.setBounds(6, 152, 161, 23);
		panel.add(btn_AppList);
		
		JButton btn_DoctorList = new JButton("\u039B\u03AF\u03C3\u03C4\u03B1 \u0399\u03B1\u03C4\u03C1\u03CE\u03BD");
		btn_DoctorList.setBounds(6, 186, 161, 23);
		panel.add(btn_DoctorList);
		
		JLabel lbl_Image = new JLabel("");
		lbl_Image.setText("");
		lbl_Image.setIcon(new ImageIcon(image));
		lbl_Image.setBounds(198, 11, 418, 239);
		frmHospitalManager.getContentPane().add(lbl_Image);
	}
}
