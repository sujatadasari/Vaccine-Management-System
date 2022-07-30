package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 700);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 0, 0));
		panel.setBounds(10, 10, 580, 100);
		contentPane.add(panel);
		
		JLabel title = new JLabel("Registration Page");
		title.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel.add(title);
		
		textField = new JTextField();
		textField.setBounds(267, 147, 130, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(267, 188, 130, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(267, 229, 130, 30);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(267, 270, 130, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(267, 311, 130, 30);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(267, 352, 130, 30);
		contentPane.add(textField_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(267, 399, 100, 30);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(381, 399, 100, 30);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(267, 446, 214, 120);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(157, 147, 100, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Middle Name:");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName.setBounds(157, 186, 100, 30);
		contentPane.add(lblLastName);
		
		JLabel lblLastName_1 = new JLabel("Last Name:");
		lblLastName_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName_1.setBounds(157, 227, 100, 30);
		contentPane.add(lblLastName_1);
		
		JLabel lblLastName_1_1 = new JLabel(" Phone No:");
		lblLastName_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName_1_1.setBounds(157, 270, 100, 30);
		contentPane.add(lblLastName_1_1);
		
		JLabel lblLastName_1_1_1 = new JLabel("Email Id :");
		lblLastName_1_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName_1_1_1.setBounds(157, 311, 100, 30);
		contentPane.add(lblLastName_1_1_1);
		
		JLabel lblLastName_1_1_1_1 = new JLabel("DOB : ");
		lblLastName_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName_1_1_1_1.setBounds(183, 352, 100, 30);
		contentPane.add(lblLastName_1_1_1_1);
		
		JLabel lblLastName_1_1_1_2 = new JLabel("Gender :");
		lblLastName_1_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName_1_1_1_2.setBounds(161, 397, 100, 30);
		contentPane.add(lblLastName_1_1_1_2);
		
		JLabel lblLastName_1_1_1_3 = new JLabel("Address :");
		lblLastName_1_1_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblLastName_1_1_1_3.setBounds(161, 462, 100, 30);
		contentPane.add(lblLastName_1_1_1_3);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setBackground(new Color(0, 255, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setToolTipText("EE");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(268, 606, 114, 36);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setBackground(new Color(255, 0, 0));
		btnReset.setBorderPainted(false);
		btnReset.setToolTipText("EE");
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnReset.setBounds(401, 606, 114, 36);
		contentPane.add(btnReset);
		setUndecorated(true);
	}

}
