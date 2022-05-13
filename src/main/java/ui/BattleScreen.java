package main.java.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.java.controller.GameController;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JToggleButton;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLayeredPane;

public class BattleScreen extends JFrame {

	private JPanel contentPane;
	private GameController gc;
	public BattleScreen(GameController gc) {
		this.gc = gc;
		initialize();
		show(true);
	}
	public void initialize()  {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ButtonGroup group = new ButtonGroup();

		for(int i = 0 ; i< 4 ; i++) {
			JToggleButton btnNewButton = new JToggleButton("Battle " + Integer.toString(i+1));
			btnNewButton.setBounds(23 + i*100, 70, 89, 23);
			contentPane.add(btnNewButton);
			group.add(btnNewButton);
		}
	
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(24, 24, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(gc.getPlayerName());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(64, 25, 159, 13);
		contentPane.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
//		panel.add(lblNewLabel);
		
		Button button = new Button("Select");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gc.launchFightScreen();
				closeAndDestoryCurrentScreen();
			}
		});
		button.setBounds(137, 212, 70, 22);
		contentPane.add(button);
		
		Button back = new Button("Back");
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gc.launchMainScreen();
				closeAndDestoryCurrentScreen();
			}
		});
		back.setBounds(224, 212, 70, 22);
		contentPane.add(back);
		
		
		
		

	}
	public void show(Boolean visible) {
		this.contentPane.setVisible(visible);
	}
	@SuppressWarnings("deprecation")
	private void closeAndDestoryCurrentScreen() {
		show(false);
		
	}
}
