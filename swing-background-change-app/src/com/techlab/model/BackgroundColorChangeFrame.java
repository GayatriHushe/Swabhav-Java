package com.techlab.model;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class BackgroundColorChangeFrame extends JFrame implements ActionListener{

	private JButton redBtn,blueBtn;

	public BackgroundColorChangeFrame() {
		
		redBtn = new JButton("red");
		blueBtn = new JButton("blue");
		
		add(redBtn);
		add(blueBtn);
		
		redBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (actionEvent.getSource() == redBtn)
				{
					getContentPane().setBackground(Color.RED);
				}
			}
		});

		blueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				if (actionEvent.getSource() == blueBtn)
				{
					getContentPane().setBackground(Color.BLUE);
				}
			}
		});
		
		setTitle("Background Color Change");
		
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Button clicked");
	}
}
