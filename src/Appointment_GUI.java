import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class Appoiment_GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Appoiment_GUI window = new Appoiment_GUI();
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
	public Appoiment_GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u0394\u03B9\u03B1\u03C7\u03B5\u03AF\u03C1\u03B7\u03C3\u03B7 \u03B5\u03C0\u03B9\u03C3\u03BA\u03AD\u03C8\u03B5\u03C9\u03BD");
		frame.setBounds(100, 100, 466, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u03A3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03B1", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(306, 11, 140, 344);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(6, 41, 128, 142);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(6, 210, 128, 127);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label = new JLabel("\u0391\u03C3\u03B8\u03B5\u03BD\u03AE\u03C2");
		label.setBounds(45, 26, 49, 14);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("\u0393\u03B9\u03B1\u03C4\u03C1\u03CC\u03C2");
		label_1.setBounds(51, 197, 43, 14);
		panel_1.add(label_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\u0395\u03B9\u03C3\u03B1\u03B3\u03C9\u03B3\u03AE \u03C3\u03C4\u03BF\u03B9\u03C7\u03B5\u03AF\u03C9\u03BD", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(4, 11, 301, 359);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(8, 16, 89, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.setBounds(107, 16, 89, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Get Info");
		btnNewButton_2.setBounds(206, 16, 89, 23);
		panel.add(btnNewButton_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(99, 60, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(99, 91, 86, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(99, 121, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(99, 152, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(101, 185, 183, 168);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u0397\u03BC\u03AD\u03C1\u03B1");
		lblNewLabel.setBounds(6, 68, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u038F\u03C1\u03B1");
		lblNewLabel_1.setBounds(6, 94, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0391.\u039C.\u039A.\u0391 \u0391\u03C3\u03B8\u03B5\u03BD\u03AE");
		lblNewLabel_2.setBounds(6, 121, 83, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0391.\u039C. \u0399\u03B1\u03C4\u03C1\u03BF\u03CD");
		lblNewLabel_3.setBounds(6, 158, 66, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u03A0\u03BB\u03B7\u03C1\u03BF\u03C6\u03BF\u03C1\u03AF\u03B5\u03C2");
		lblNewLabel_4.setBounds(6, 188, 66, 14);
		panel.add(lblNewLabel_4);
	}
}
