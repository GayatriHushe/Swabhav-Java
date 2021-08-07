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
import javax.swing.JTextField;
import com.techlab.business.model.Mark;
import com.techlab.business.model.Player;

public class MainFrame extends JFrame {
	private Container c;
	private JButton btnNext12;
	private JLabel labelPlayerName1, labelPlayerName2,labelCopyright;
	private JTextField txtName1,txtName2;
	
	private ArrayList<Player> players=new ArrayList<Player>();
	private String player1Name,player2Name;

	public MainFrame()
	{
		c=getContentPane();
		c.setLayout(new FlowLayout());
		c.setBackground(Color.pink);
		
		btnNext12=new JButton("Next");
		btnNext12.setPreferredSize(new Dimension(100, 40));
		btnNext12.setFont(new Font("Arial", Font.BOLD, 16));

		labelPlayerName1=new JLabel("Enter player1 name ");
		txtName1=new JTextField(15);
		
		labelPlayerName1.setPreferredSize(new Dimension(150,40));
		labelPlayerName1.setFont(new Font("Arial", Font.BOLD, 15));
		txtName1.setPreferredSize(new Dimension(100,40));
		txtName1.setFont(new Font("Arial", Font.BOLD, 16));

		labelPlayerName2=new JLabel("Enter player2 name ");
		txtName2=new JTextField(15);
		
		labelPlayerName2.setPreferredSize(new Dimension(150,40));
		labelPlayerName2.setFont(new Font("Arial", Font.BOLD, 15));
		txtName2.setPreferredSize(new Dimension(100,40));
		txtName2.setFont(new Font("Arial", Font.BOLD, 16));

		labelCopyright=new JLabel("Created by Gayatri",JLabel.CENTER);
//		labelCopyright.setBounds(MAXIMIZED_BOTH, MAXIMIZED_VERT, WIDTH, HEIGHT);
		
		c.add(labelPlayerName1);
		c.add(txtName1);
		c.add(labelPlayerName2);
		c.add(txtName2);
		
		c.add(btnNext12);
		c.add(labelCopyright);

		ActionListener a1=(ae)->{
			player1Name=txtName1.getText();
			player2Name=txtName2.getText();
			
			Player player1=new Player(player1Name,Mark.X);
			Player player2=new Player(player2Name,Mark.O);

			players.add(player1);
			players.add(player2);
			
			BoardSizeInputFrame bsf=new BoardSizeInputFrame(players);
			dispose();
		};
		btnNext12.addActionListener(a1);	

		setTitle("Main Frame");
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(420, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
