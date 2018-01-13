import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Doctor_GUI extends JFrame {

	private JFrame frame;
	private JTextField text_Name;
	private JTextField text_Sname;
	private JTextField text_Phone;
	private JTextField text_ArMitr;
	private JComboBox combo_Sp;
	private JComboBox combo_dep;

	/**
	 * Launch the application.
	 */
			public static void run() {
				try {
					Doctor_GUI window = new Doctor_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

	/**
	 * Create the application.
	 */
	public Doctor_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B9\u03C3\u03B7 \u0399\u03B1\u03C4\u03C1\u03CE\u03BD");
		frame.setBounds(100, 100, 387, 363);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(229, 28, 132, 138);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				saveAction();
			}
		});
		btnNewButton.setBounds(21, 22, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBounds(21, 56, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Get Info");
		btnNewButton_2.setBounds(21, 90, 89, 23);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 209, 257);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		text_ArMitr = new JTextField();
		text_ArMitr.setBounds(89, 18, 110, 20);
		panel_1.add(text_ArMitr);
		text_ArMitr.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u03A4\u03BC\u03AE\u03BC\u03B1:");
		lblNewLabel_4.setBounds(10, 205, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		combo_dep = new JComboBox();
		combo_dep.setBounds(89, 202, 110, 20);
		panel_1.add(combo_dep);
		combo_dep.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Αιματολογικό", "Δερματολογικό","Καρδιολογικό","Ορθοπαιδικο","Παθολογικό","Παιδιατρικό","Πνευματολογικό","Χειρουργικό","Ψυχιατρικό","ΩΡΛ" }));
		
		JLabel lblNewLabel_3 = new JLabel("\u0395\u03B9\u03B4\u03B9\u03BA\u03CC\u03C4\u03B7\u03C4\u03B1");
		lblNewLabel_3.setBounds(10, 169, 60, 14);
		panel_1.add(lblNewLabel_3);
		
		combo_Sp = new JComboBox();
		combo_Sp.setBounds(89, 166, 110, 20);
		panel_1.add(combo_Sp);
		combo_Sp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Δερματολόγος", "Καρδιολόγος","Μικροβιολόγος","Ορθοπαιδικός","Παθολόγος","Παιδίατρος","Πνευμονολόγος","Χειρούργος","Ψυχίατρος","ΩΡΛ"}));
		
		JLabel lblNewLabel_2 = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF:");
		lblNewLabel_2.setBounds(10, 130, 60, 14);
		panel_1.add(lblNewLabel_2);
		
		text_Phone = new JTextField();
		text_Phone.setBounds(89, 127, 110, 20);
		panel_1.add(text_Phone);
		text_Phone.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		lblNewLabel_1.setBounds(10, 93, 60, 14);
		panel_1.add(lblNewLabel_1);
		
		text_Sname = new JTextField();
		text_Sname.setBounds(89, 90, 110, 20);
		panel_1.add(text_Sname);
		text_Sname.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1:");
		lblNewLabel.setBounds(10, 55, 46, 14);
		panel_1.add(lblNewLabel);
		
		text_Name = new JTextField();
		text_Name.setBounds(89, 52, 110, 20);
		panel_1.add(text_Name);
		text_Name.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u0391\u03C1. \u039C\u03B7\u03C4\u03C1.:");
		lblNewLabel_5.setBounds(10, 21, 60, 14);
		panel_1.add(lblNewLabel_5);
	}
	private void saveAction() {
		
	    if (text_Name.getText().equals("")) {
	        JOptionPane.showMessageDialog(null,"Please enter name");
	        return;
	         }
	     if (text_Sname.getText().equals("")) {
	        JOptionPane.showMessageDialog(null, "Please enter  lastname");          
	        return;
	         }
	     
	      if (text_ArMitr.equals("")) {
	        JOptionPane.showMessageDialog( null, "Please enter A.M.K.A");
	        return;
	         }
	       
	        if (text_Phone.getText().equals("")) {
		           JOptionPane.showMessageDialog( null, "Please enter Phone");
		           return;
		            }	
	        int arMitr= Integer.parseInt(text_ArMitr.getText());
	        int phone = Integer.parseInt(text_Phone.getText());
	        String sp = String.valueOf(combo_Sp.getSelectedItem());
	        String dep = String.valueOf(combo_dep.getSelectedItem());
	        Doctor d = new Doctor(arMitr, text_Name.getText(), text_Sname.getText(), phone, sp , dep);
		}
}
