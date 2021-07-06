package com.techlab.model;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JButton;
import javax.swing.JFrame;


public class MainFrame extends JFrame{
	private Container c;
	private JButton helloBtn,printSyncBtn,printAsyncBtn;

	public MainFrame() {
		c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.pink);

		helloBtn=new JButton("Hello");
		helloBtn.setPreferredSize(new Dimension(100, 40));
		helloBtn.setFont(new Font("Arial", Font.BOLD, 16));

		printSyncBtn=new JButton("Print Sync");
		printSyncBtn.setPreferredSize(new Dimension(200, 40));
		printSyncBtn.setFont(new Font("Arial", Font.BOLD, 16));

		printAsyncBtn=new JButton("Print Async");
		printAsyncBtn.setPreferredSize(new Dimension(200, 40));
		printAsyncBtn.setFont(new Font("Arial", Font.BOLD, 16));

		c.add(helloBtn);
		c.add(printSyncBtn);
		c.add(printAsyncBtn);

		helloBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hello...");
			}
		});	

		printSyncBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				while(true)			
					System.out.println("Sync : "+LocalTime.now());
			}
		});	

		printAsyncBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread t1=new Thread(new AsyncRunnable());
				t1.start();
			}
		});	

		setTitle("Main Frame");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
