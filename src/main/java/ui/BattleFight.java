package main.java.ui;

import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import main.java.model.Battles;
import main.java.model.Monster;
import main.java.controller.GameController;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleFight extends JFrame {
	private String a;
	private ArrayList<Monster> monster;
	private ArrayList<Monster> enemy;
	private JPanel contentPane;
	private GameController gc;
	private JLabel lblNewLabel_1;
	private JTextArea txtrZx;
	private JTextArea text;
	private JButton button_1;
	private JButton button;
	/**
	 * Launch the application.
	 */
	public BattleFight(GameController gc) {
		this.gc = gc;
		initialize();
		show(true);
	}
	public void initialize(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(30, 21, 46, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel(gc.getPlayerName());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(86, 20, 76, 16);
		contentPane.add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setBounds(30, 268, 385, 69);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Enemy");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(326, 21, 47, 14);
		contentPane.add(lblNewLabel_2);
		
		txtrZx = new JTextArea();
		txtrZx.setBackground(Color.PINK);
		
		
		for (int i = 0 ; i < gc.getTeamMember().size() ; i++) {
			JButton btnNewButton_2_1_1_1 = new JButton(gc.getTeamMember().get(i).getName());
			btnNewButton_2_1_1_1.setBounds(36, 46+25*i, 100, 23);
			txtrZx.setBounds(153, 35 + 25*i, 86, 55);
			txtrZx.setVisible(false);
			a = "Damage : " + Integer.toString(gc.getTeamMember().get(i).getDamage()) + "\n" + "Level: " + Integer.toString(gc.getTeamMember().get(i).getLevel()) ;
			txtrZx.setText(a);
			btnNewButton_2_1_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					contentPane.add(txtrZx);
					txtrZx.setVisible(true);
					txtrZx.setText(a);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					txtrZx.setVisible(false);
				}
			});
			contentPane.add(txtrZx);
			contentPane.add(btnNewButton_2_1_1_1);
		}
		
		for (int i = 0 ; i < gc.getenemyMonsters().size(); i++) {
			JButton btnNewButton_2_2 = new JButton(gc.getenemyMonsters().get(i).getName());
			btnNewButton_2_2.setBounds(304, 46+25*i, 89, 23);
			contentPane.add(btnNewButton_2_2);
		}
		
		JLabel lblNewLabel_3 = new JLabel("VS");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(178, 78, 76, 43);
		contentPane.add(lblNewLabel_3);
		
		text = new JTextArea();
		text.setFont(new Font("Tahoma", Font.BOLD, 13));
		text.setBounds(34, 179, 270, 71);
		contentPane.add(text);
		text.setColumns(10);
		button = new JButton("Process");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				try {
					Fight(gc.getTeamMember(),gc.getenemyMonsters(),true,text);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBounds(326, 179, 89, 22);
		contentPane.add(button);
		
		button_1 = new JButton("Give up");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gc.launchBattle();
				closeAndDestoryCurrentScreen();
				
			}
		});
		button_1.setBounds(326, 228, 89, 22);
		contentPane.add(button_1);

	}
	private void  Fight(ArrayList<Monster> monster, ArrayList<Monster> enemy, boolean isPlayerTurn, JTextArea text) throws Exception {
		int i = 0;
		int j = 0;
		do {
			if (isPlayerTurn == true) {
				text.setText(monster.get(i).getName() + " attack " + enemy.get(j).getName());
				monster.get(i).attack(enemy.get(j));
				
				if (enemy.get(j).isFainted() == true) {
					text.setText(enemy.get(j).getName() + " is fainted. \nThe second monster wil repalce.");
					j++;
				}
				text.setText(enemy.get(j).getName() + " attack " + monster.get(i).getName());
				enemy.get(j).attack(monster.get(i));
				if (monster.get(i).isFainted() == true) {
					text.setText(monster.get(i).getName() + " is fainted. \nThe next monster wil repalce.");
					i++;
				}
				if (i == monster.size()) {
					text.setText("Player has loose the battle. You will not \nrecive any gold and point.");
				}
				else if (j == enemy.size()){
					text.setText("Enemy has loose the battle. You will \nrecive 500 gold and 500 point.");
					gc.setGold(gc.getGold()+500);
					gc.setPoint(gc.getPoint() + 500);
				}
			}
			else {
				enemy.get(j).attack(monster.get(i));
				if (monster.get(i).isFainted() == true) {
					i++;
				}
				monster.get(i).attack(enemy.get(j));
				if (enemy.get(j).isFainted()==true) {
					j++;
				}
			}
		}while(i<monster.size() || j<enemy.size());
		text.setText("Player has loose the battle.");
	}
	public void show(Boolean visible) {
		this.contentPane.setVisible(visible);
	}
	@SuppressWarnings("deprecation")
	private void closeAndDestoryCurrentScreen() {
		show(false);
		
	}
	
}

