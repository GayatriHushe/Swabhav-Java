package com.techlab.presentation.model.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import com.techlab.business.model.Board;
import com.techlab.business.model.Game;
import com.techlab.business.model.Player;
import com.techlab.business.model.Result;
import com.techlab.business.model.ResultAnalyzer;

public class GameFrame implements ActionListener {

	private Game game;
	private JLabel gameLabel;
	private int boardSize;
	private Board board;
	private List<JButton> buttons = new ArrayList<JButton>();
	private List<Player> players;
	private ResultAnalyzer resultAnalyzer;
	private Container c;
	private JFrame frame;
	
	public GameFrame(ArrayList<Player> players, int boardSize) {
				
		this.boardSize=boardSize;
		this.players=players;

		board=new Board(boardSize);
		resultAnalyzer=new ResultAnalyzer(board);

		game=new Game(resultAnalyzer, players,board);
		
		frame = new JFrame();
		frame.setSize(420,200);
						
		JPanel mainPanel = new JPanel(new GridLayout(boardSize, boardSize));
		mainPanel.setPreferredSize(new Dimension(200,200));
		
		gameLabel=new JLabel("Current Player is "+game.getCurrentPlayer().getName()+" and Game status is InProgress");
		gameLabel.setFont(new Font("Arial", Font.BOLD, 15));
		frame.add((gameLabel),BorderLayout.NORTH);
		
		for (int i = 1; i <= (boardSize*boardSize); i++)
		{
			JButton button = new JButton(String.valueOf(i));
			button.addActionListener(this);
			mainPanel.add(button);
			buttons.add(button);
		}
		
		frame.add(mainPanel,BorderLayout.CENTER);
		frame.pack();
		frame.setLayout(new GridLayout(boardSize, boardSize));		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

	private void disableButtons()
	{
		for (JButton button : buttons)
		{
			button.setEnabled(false);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Player currentPlayer=game.getCurrentPlayer();
		String currentPlayermark=String.valueOf(currentPlayer.getMark());
		
		int cellNo=Integer.parseInt(e.getActionCommand())-1;
		buttons.get(cellNo).setText(game.getCurrentPlayer().getMark().toString());
		if(currentPlayer.equals(players.get(0)))
		{
			buttons.get(cellNo).setBackground(Color.ORANGE);
		}
		else
		{
			buttons.get(cellNo).setBackground(Color.GREEN);
		}
		
		game.play(cellNo, board);
		
		if(game.isWinner())
		{
			JOptionPane.showMessageDialog(c, "Winner is "+game.getWinnerName());
			disableButtons();
			System.exit(0);
		}
		if(game.checkIfBoardFull())
		{
			JOptionPane.showMessageDialog(c, "Game is "+Result.DRAW);
			disableButtons();
			System.exit(0);
		}
		game.switchPlayer();
		gameLabel.setText("Current Player is "+game.getCurrentPlayer().getName()+" and Game status is InProgress");
		
	}

}
