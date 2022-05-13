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
import java.util.Arrays;

import main.java.model.*;

public class ToShop extends JFrame {

	private JPanel contentPane;
	private GameController gc;
	private JLabel lblNewLabel_4;
	private String[] array_monstershop;
	
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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(30, 11, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(this.gc.getPlayerName());
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(74, 11, 128, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gold:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(212, 11, 37, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel(Integer.toString(this.gc.getGold()));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(245, 11, 69, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Monster");
		btnNewButton.setBounds(68, 36, 134, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Item");
		btnNewButton_1.setBounds(212, 36, 133, 23);
		getContentPane().add(btnNewButton_1);
		
		ArrayList<Monster> monstershop = this.gc.getinitshopMonsters();
		String[] array_monstershop = {monstershop.get(0).getName(),monstershop.get(1).getName(),monstershop.get(2).getName()};
		JList List = new JList(array_monstershop);
		List.setFont(new Font("Tahoma", Font.PLAIN, 10));
		List.setBounds(68, 70, 134, 60);
		getContentPane().add(List);
//		
		ArrayList<GameItem> itemshop = this.gc.getinitshopitem();
		String array_itemshop[] = {itemshop.get(0).getName(),itemshop.get(1).getName(),itemshop.get(2).getName()};
		JList list_1 = new JList(array_itemshop);
		list_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		list_1.setBounds(212, 70, 133, 60);
		getContentPane().add(list_1);
		
		ArrayList<Monster> monsterteam = gc.getTeamMember();
		String[] array_monsterteam = {};
		
		for (Monster b : monsterteam) {
			array_monsterteam = append(array_monsterteam,b.getName());
		}
		
		JList list_2 = new JList(array_monsterteam);
		list_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		list_2.setBounds(68, 141, 133, 73);
		getContentPane().add(list_2);
		
		ArrayList<GameItem> itembag= gc.getItemBag();
		String[] array_itembag = {};
		
		for (GameItem b : itembag) {
			array_itembag = append(array_itembag,b.getName());
		}
		JList list_2_1 = new JList(array_itembag);
		list_2_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		list_2_1.setBounds(212, 141, 133, 73);
		getContentPane().add(list_2_1);
		
		lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setBounds(135, 225, 179, 14);
		contentPane.add(lblNewLabel_4);
		
		JButton btnNewButton_2 = new JButton("BUY");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(gc.getGold() > monstershop.get(List.getSelectedIndex()).getPrice()) {
					gc.setGold(gc.getGold() - monstershop.get(List.getSelectedIndex()).getPrice());
					gc.addMonsterToTeam(monstershop.get(list_1.getSelectedIndex()));
					gc.addItemrBag(itemshop.get(List.getSelectedIndex()));
					monstershop.remove(List.getSelectedIndex());
				}else if (gc.getGold()<0){
					lblNewLabel_4.setText("You're not enough gold to buy this");
				}
				if(gc.getGold() > itemshop.get(list_1.getSelectedIndex()).getPrice()) {
					gc.setGold(gc.getGold()  - itemshop.get(list_1.getSelectedIndex()).getPrice());
					gc.addItemrBag(itemshop.get(List.getSelectedIndex()));
					itemshop.remove(list_1.getSelectedIndex());
				}else if (gc.getGold()<0){
					lblNewLabel_4.setText("You're not enough gold to buy this");
				}
				gc.launchToShop();
				closeAndDestoryCurrentScreen();
				
				
			}
		});
		btnNewButton_2.setBounds(355, 84, 71, 28);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("SELL");
		btnNewButton_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gc.setGold(gc.getGold() + monstershop.get(list_2.getSelectedIndex()).getPrice());
				gc.removeMonsterToTeam(monstershop.get(list_2.getSelectedIndex()));
				gc.launchToShop();
				closeAndDestoryCurrentScreen();
			}
		});
		btnNewButton_2_1.setBounds(355, 162, 71, 28);
		getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("Exit Shop");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				gc.launchMainScreen();
				closeAndDestoryCurrentScreen();
			}
		});
		btnNewButton_3.setBounds(161, 238, 89, 23);
		getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_3 = new JLabel("Your: ");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 157, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		
		
	}
	static <T> T[] append(T[] arr, T element) {
	    final int N = arr.length;
	    arr = Arrays.copyOf(arr, N + 1);
	    arr[N] = element;
	    return arr;
	}
	public void show(Boolean visible) {
		this.contentPane.setVisible(visible);
	}
	@SuppressWarnings("deprecation")
	private void closeAndDestoryCurrentScreen() {
		show(false);
		
	}
}