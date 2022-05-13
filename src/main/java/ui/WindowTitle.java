package main.java.ui;

import javax.swing.*;
import main.java.controller.GameController;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.Color;
import main.java.model.*;
import java.awt.event.*;
public class WindowTitle {
	
	private GameController gc;
	private JFrame frame;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public WindowTitle(GameController gc) {
		this.gc = gc;
		initialize();
		show(true);
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(UIManager.getColor("Button.background"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setText(this.gc.getPlayerName());
		lblNewLabel.setBounds(69, 26, 213, 14);
		frame.getContentPane().add(lblNewLabel);
		
		ArrayList<Monster> monsterinit = this.gc.getInitMonsters();
		JToggleButton txtMonster = new JToggleButton();
		txtMonster.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMonster.isSelected()) {
					gc.addMonsterToTeam(monsterinit.get(0));
				}
			}
		});
		txtMonster.setBackground(new Color(250, 235, 215));
		txtMonster.setFont(new Font("Arial", Font.PLAIN, 12));
		txtMonster.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonster.setText(monsterinit.get(0).getName());
		txtMonster.setBounds(27, 75, 86, 20);
		frame.getContentPane().add(txtMonster);
		
		JToggleButton txtMonster_1 = new JToggleButton();
		txtMonster_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMonster_1.isSelected()) {
					gc.addMonsterToTeam(monsterinit.get(1));
				}
			}
		});
		txtMonster_1.setBackground(new Color(250, 235, 215));
		txtMonster_1.setFont(new Font("Arial", Font.PLAIN, 12));
		txtMonster_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonster_1.setText(monsterinit.get(1).getName());
		txtMonster_1.setBounds(126, 75, 86, 20);
		frame.getContentPane().add(txtMonster_1);

		
		JToggleButton txtMonster_2 = new JToggleButton();
		txtMonster_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMonster_2.isSelected()) {
					gc.addMonsterToTeam(monsterinit.get(2));
				}
			}
		});
		txtMonster_2.setBackground(new Color(250, 235, 215));
		txtMonster_2.setFont(new Font("Arial", Font.PLAIN, 12));
		txtMonster_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonster_2.setText(monsterinit.get(2).getName());
		txtMonster_2.setBounds(222, 75, 86, 20);
		frame.getContentPane().add(txtMonster_2);
		
		JToggleButton txtMonster_3 = new JToggleButton();
		txtMonster_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMonster.isSelected()) {
					gc.addMonsterToTeam(monsterinit.get(0));
				}
			}
		});
		txtMonster_3.setBackground(new Color(250, 235, 215));
		txtMonster_3.setFont(new Font("Arial", Font.PLAIN, 12));
		txtMonster_3.setHorizontalAlignment(SwingConstants.CENTER);
		txtMonster_3.setText(monsterinit.get(3).getName());
		txtMonster_3.setBounds(318, 75, 86, 20);
		frame.getContentPane().add(txtMonster_3);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Select");
		tglbtnNewToggleButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gc.launchMainScreen();
				closeAndDestoryCurrentScreen();
			}
		});
		tglbtnNewToggleButton.setBounds(161, 227, 121, 23);
		frame.getContentPane().add(tglbtnNewToggleButton);
		
		JLabel lblChangeMonstersName = new JLabel("Choose monster to fight!");
		lblChangeMonstersName.setBounds(27, 50, 156, 14);
		frame.getContentPane().add(lblChangeMonstersName);
		
		
		JLabel lblNewLabel_1 = new JLabel("Damge: "+ monsterinit.get(0).getDamage());
		lblNewLabel_1.setBounds(27, 124, 86, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Health: "+ monsterinit.get(0).getCurrentHealth());
		lblNewLabel_1_1.setBounds(27, 149, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Level: " + monsterinit.get(0).getLevel());
		lblNewLabel_1_2.setBounds(27, 174, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Damge: "+ monsterinit.get(1).getDamage());
		lblNewLabel_1_3.setBounds(126, 124, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Health: "+ monsterinit.get(1).getCurrentHealth());
		lblNewLabel_1_4.setBounds(126, 149, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Level: " + monsterinit.get(1).getLevel());
		lblNewLabel_1_5.setBounds(126, 174, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Damge: "+ monsterinit.get(2).getDamage());
		lblNewLabel_1_3_1.setBounds(222, 124, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("Health: "+ monsterinit.get(2).getCurrentHealth());
		lblNewLabel_1_3_1_1.setBounds(222, 149, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_3_1_1);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("Level: " + monsterinit.get(2).getLevel());
		lblNewLabel_1_3_1_1_1.setBounds(222, 174, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_3_1_1_1);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Damge: "+ monsterinit.get(3).getDamage());
		lblNewLabel_1_3_1_2.setBounds(318, 124, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_3_1_2);
		
		JLabel lblNewLabel_1_3_1_1_2 = new JLabel("Health: "+ monsterinit.get(3).getCurrentHealth());
		lblNewLabel_1_3_1_1_2.setBounds(318, 149, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_3_1_1_2);
		
		JLabel lblNewLabel_1_3_1_1_1_1 = new JLabel("Level: " + monsterinit.get(3).getLevel());
		lblNewLabel_1_3_1_1_1_1.setBounds(318, 174, 86, 14);
		frame.getContentPane().add(lblNewLabel_1_3_1_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(161, 202, 129, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(27, 26, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);

	}
	private void show(Boolean visible) {
		this.frame.setVisible(visible);
	}
	@SuppressWarnings("deprecation")
	private void closeAndDestoryCurrentScreen() {
		show(false);
		
	}
}
