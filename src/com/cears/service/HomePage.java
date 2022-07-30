package com.cears.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(118, 35, 238, -5);
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(250, 128, 114));
		panel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		panel_1.setBounds(0, 0, 815, 123);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel title = new JLabel("Welcome to Vaccination Drive");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 30));
		title.setBounds(129, 5, 467, 81);
		panel_1.add(title);
		
		JButton login = new JButton("Login");
		login.setBorderPainted(false);
		login.setBackground(new Color(0, 255, 0));
		login.setFont(new Font("Tahoma", Font.PLAIN, 20));
		login.setBounds(302, 215, 150, 40);
		contentPane.add(login);
		
		JButton signUp = new JButton("Sign Up");
		signUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage rg = new RegistrationPage();
				rg.setVisible(true);
				setVisible(false);
			}
		});
		signUp.setBorderPainted(false);
		signUp.setBackground(new Color(192, 192, 192));
		signUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		signUp.setBounds(302, 293, 150, 40);
		contentPane.add(signUp);
		setUndecorated(true);
	}

}
