package com.practice.cashregisterdrawer;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class CashRegisterJFrame extends JFrame {

	public ICashRegisterDrawer drawer;
	
	private JPanel contentPane;
	private JTextField textFieldStatus;
	
	public void updateDrawerStatus(){
		this.textFieldStatus.setText(drawer.getDrawerStatus().toString());
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashRegisterJFrame frame = new CashRegisterJFrame();
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
	public CashRegisterJFrame() {
		
		drawer = (ICashRegisterDrawer) new DemoCashRegisterDrawer();
		updateDrawerStatus();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 708, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnOpen = new JButton("Open Drawer");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawer.Open();
				updateDrawerStatus();
			}
		});
		contentPane.add(btnOpen, BorderLayout.WEST);
		
		JButton btnClosed = new JButton("Closed Drawer");
		btnClosed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawer.Close();
				updateDrawerStatus();
			}
		});
		contentPane.add(btnClosed, BorderLayout.EAST);
		
		textFieldStatus = new JTextField();
		contentPane.add(textFieldStatus, BorderLayout.CENTER);
		textFieldStatus.setColumns(10);
		
		JLabel lblDrawerStatus = new JLabel("Drawer Status");
		contentPane.add(lblDrawerStatus, BorderLayout.NORTH);
	}

}
