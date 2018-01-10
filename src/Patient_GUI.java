import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JSplitPane;
import java.awt.ScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Patient_GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Patient_GUI window = new Patient_GUI();
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
	public Patient_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 513, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Διαχείριση ασθενών");
		
		JLabel lblNewLabel = new JLabel("\u0391.\u039C.\u039A.\u0391");
		lblNewLabel.setBounds(20, 27, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\u0395\u03C0\u03CC\u03BD\u03C5\u03BC\u03BF");
		label.setBounds(20, 64, 57, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u038C\u03BD\u03BF\u03BC\u03B1");
		label_1.setBounds(20, 104, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0394\u03B9\u03B5\u03CD\u03B8\u03C5\u03BD\u03C3\u03B7");
		label_2.setBounds(20, 139, 73, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF");
		label_3.setBounds(20, 174, 73, 14);
		frame.getContentPane().add(label_3);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(20, 211, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		JLabel label_5 = new JLabel("\u0397\u03BB\u03B9\u03BA\u03AF\u03B1");
		label_5.setBounds(20, 245, 46, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("\u03A6\u03CD\u03BB\u03BB\u03BF");
		label_6.setBounds(20, 283, 46, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("\u039F\u03BC\u03AC\u03B4\u03B1 \u0391\u03AF\u03BC\u03B1\u03C4\u03BF\u03C2");
		label_7.setBounds(20, 321, 89, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("\u03A0\u03BB\u03B7\u03C1\u03BF\u03C6\u03BF\u03C1\u03AF\u03B5\u03C2");
		label_8.setBounds(20, 356, 73, 14);
		frame.getContentPane().add(label_8);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(103, 61, 115, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(103, 101, 115, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(103, 136, 115, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(103, 171, 115, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(103, 208, 115, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(103, 242, 115, 20);
		frame.getContentPane().add(textField_6);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(103, 356, 192, 95);
		frame.getContentPane().add(textField_9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(113, 280, 40, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(113, 318, 40, 20);
		frame.getContentPane().add(comboBox_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(341, 38, 134, 248);
		frame.getContentPane().add(panel);
		panel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		panel.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("Get Data");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(24, 189, 89, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setBounds(24, 44, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New");
		btnNewButton_2.setBounds(24, 89, 89, 23);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.setBounds(24, 139, 89, 23);
		panel.add(btnNewButton_3);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 321, 453);
		frame.getContentPane().add(panel_1);
		panel_1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(92, 11, 115, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
	}
}
