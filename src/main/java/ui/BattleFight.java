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

	private JPanel contentPane;
	private GameController gc;
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
		
		JLabel lblNewLabel_1 = new JLabel(gc.getPlayerName());
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
		
		for (int i = 0 ; i < gc.getTeamMember().size() ; i++) {
			JButton btnNewButton_2_1_1_1 = new JButton(gc.getTeamMember().get(i).getName());
			btnNewButton_2_1_1_1.setBounds(36, 46+25*i, 89, 23);
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
		
		JTextField text = new JTextField();
		text.setFont(new Font("Tahoma", Font.BOLD, 13));
		text.setHorizontalAlignment(SwingConstants.LEFT);
		text.setBounds(34, 179, 270, 71);
		contentPane.add(text);
		text.setColumns(10);
		
		JButton btnNewButton = new JButton("Proceed");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Fight(gc.getTeamMember(),gc.getenemyMonsters(),true);
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(326, 179, 89, 23);
		
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Give up");
		btnNewButton_1.setBounds(326, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		

		
	}

	public void show(Boolean visible) {
		this.contentPane.setVisible(visible);
	}
	@SuppressWarnings("deprecation")
	private void closeAndDestoryCurrentScreen() {
		show(false);
		
	}
	public void  Fight(ArrayList<Monster> monster, ArrayList<Monster> enemy, boolean isPlayerTurn) {
		int i = 0;
		int j = 2;
		JTextField text = new JTextField();
		text.setFont(new Font("Tahoma", Font.BOLD, 13));
		text.setHorizontalAlignment(SwingConstants.LEFT);
		text.setBounds(34, 179, 270, 71);
		contentPane.add(text);
		text.setColumns(10);
		try {
		
			do {
				if (isPlayerTurn == true) {
					text.setText(monster.get(i).getName() + " attack " + enemy.get(j).getName());
					monster.get(i).attack(enemy.get(j));
					
					Thread.sleep(500);
					if (enemy.get(j).isFainted() == true) {
						text.setText(enemy.get(j).getName() + " is fainted. The second monster wil repalce.");
						j++;
						Thread.sleep(500);
					}
					text.setText(enemy.get(j).getName() + " attack " + monster.get(i).getName());
					enemy.get(j).attack(monster.get(i));
					Thread.sleep(500);
					if (monster.get(i).isFainted() == true) {
						text.setText(monster.get(i).getName() + " is fainted. The next monster wil repalce.");
						i++;
						Thread.sleep(500);
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
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i == (monster.size()-1)) {
			text.setText("Player has loose the battle.");
		}
		else {
			text.setText("Enemy has loose the battle.");
		}
	}
}

