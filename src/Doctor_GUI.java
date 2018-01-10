import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Doctor_GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Doctor_GUI window = new Doctor_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
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
		frame.setBounds(100, 100, 366, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(229, 40, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBounds(229, 83, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Get Info");
		btnNewButton_2.setBounds(229, 121, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(208, 26, 132, 138);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 185, 257);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBounds(89, 18, 86, 20);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u03A4\u03BC\u03AE\u03BC\u03B1:");
		lblNewLabel_4.setBounds(10, 205, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(89, 202, 86, 20);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("\u0395\u03B9\u03B4\u03B9\u03BA\u03CC\u03C4\u03B7\u03C4\u03B1");
		lblNewLabel_3.setBounds(10, 169, 60, 14);
		panel_1.add(lblNewLabel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(89, 166, 86, 20);
		panel_1.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF:");
		lblNewLabel_2.setBounds(10, 130, 60, 14);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(89, 127, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u0395\u03C0\u03CE\u03BD\u03C5\u03BC\u03BF:");
		lblNewLabel_1.setBounds(10, 93, 60, 14);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 90, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1:");
		lblNewLabel.setBounds(10, 55, 46, 14);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(89, 52, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u0391\u03C1. \u039C\u03B7\u03C4\u03C1.:");
		lblNewLabel_5.setBounds(10, 21, 60, 14);
		panel_1.add(lblNewLabel_5);
	}
}
