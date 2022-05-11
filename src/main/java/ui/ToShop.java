package main.java.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import main.java.controller.GameController;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import main.java.model.*;

public class ToShop extends JFrame {

	private JPanel contentPane;
	private GameController gc;
	
	public ToShop(GameController gc) {
		this.gc = gc;
		initialize();
		show(true);
		
	}
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(32, 26, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(this.gc.getPlayerName());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(74, 26, 69, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gold:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(212, 26, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel(Integer.toString(this.gc.getGold()));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(248, 26, 69, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Monster");
		btnNewButton.setBounds(74, 52, 134, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Item");
		btnNewButton_1.setBounds(222, 52, 133, 23);
		getContentPane().add(btnNewButton_1);
		
		ArrayList<Monster> monstershop = this.gc.getinitshopMonsters();
//		
		String array_monstershop[] = {monstershop.get(0).getName(),monstershop.get(1).getName(),monstershop.get(2).getName()};
		JList List = new JList(array_monstershop);
		List.setBounds(74, 85, 134, 60);
		getContentPane().add(List);
//		
		ArrayList<GameItem> itemshop = this.gc.getinitshopitem();
		String array_itemshop[] = {itemshop.get(0).getName(),itemshop.get(1).getName(),itemshop.get(2).getName()};
		JList list_1 = new JList(array_itemshop);
		list_1.setBounds(220, 85, 133, 60);
		getContentPane().add(list_1);

//		ArrayList<Monster> monsterteam = gc.getTeamMember();
//		String array_monsterteam[] = {monsterteam.get(0).getName(),monsterteam.get(1).getName(),monsterteam.get(2).getName()};
		JList list_2 = new JList(array_itemshop);
		list_2.setBounds(75, 156, 133, 60);
		getContentPane().add(list_2);
//		
		JList list_2_1 = new JList(array_itemshop);
		list_2_1.setBounds(220, 154, 133, 60);
		getContentPane().add(list_2_1);
		
		JButton btnNewButton_2 = new JButton("BUY");
		btnNewButton_2.setBounds(363, 81, 61, 60);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("SELL");
		btnNewButton_2_1.setBounds(363, 154, 61, 60);
		getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("Exit Shop");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gc.launchMainScreen();
				closeAndDestoryCurrentScreen();
			}
		});
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(162, 227, 89, 23);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Your:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(19, 156, 46, 14);
		contentPane.add(lblNewLabel_3);
	}
	public void show(Boolean visible) {
		this.contentPane.setVisible(visible);
	}
	@SuppressWarnings("deprecation")
	private void closeAndDestoryCurrentScreen() {
		show(false);
		
	}
}
