package com.techlab.presentation.model.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.techlab.business.model.Player;

public class BoardSizeInputFrame extends JFrame {
	Container c;
	JButton btnNext23;
	JLabel labelBoardSize;
	JTextField txtSize;
	String getValue;
	private List<Player> players;
	

	public BoardSizeInputFrame(ArrayList<Player> players) {
		this.players=players;
		
		c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.pink);
		
		btnNext23=new JButton("Next");
		btnNext23.setPreferredSize(new Dimension(100, 40));
		btnNext23.setFont(new Font("Arial", Font.BOLD, 16));

		labelBoardSize=new JLabel("Enter board size ");
		txtSize=new JTextField(15);
		
		labelBoardSize.setPreferredSize(new Dimension(150,40));
		labelBoardSize.setFont(new Font("Arial", Font.BOLD, 15));
		txtSize.setPreferredSize(new Dimension(100,40));
		txtSize.setFont(new Font("Arial", Font.BOLD, 16));

		c.add(labelBoardSize);
		c.add(txtSize);

		c.add(btnNext23);

		ActionListener a2=(ae)->{
			
			getValue = txtSize.getText();
			//JOptionPane.showMessageDialog(c, getValue);
			int boardSize=Integer.parseInt(getValue);
			System.out.println(boardSize);
			GameFrame pf=new GameFrame(players,boardSize);
			dispose();
		};
		btnNext23.addActionListener(a2);	
		
		
				
		setTitle("Board Size Frame");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(420, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
