package main.java.ui;



import javax.swing.*;
import javax.swing.border.EmptyBorder;
import main.java.controller.*;
import java.awt.Font;
import java.awt.Button;
import java.awt.event.*;


public class MainGame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private GameController gc;
	/**
	 * Launch the application.
	 */
	@SuppressWarnings("deprecation")
	public MainGame(GameController gc) {
		this.gc = gc;
		initialize();
		show(true);
		
	}
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
		JLabel lblScore = new JLabel("Score: ");
		lblScore.setFont(new Font("Arial", Font.BOLD, 12));
		lblScore.setBounds(126, 21, 40, 14);
		contentPane.add(lblScore);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Arial", Font.BOLD, 12));
		lblName.setBounds(10, 21, 40, 14);
		contentPane.add(lblName);
		
		JLabel lblGold = new JLabel("Gold:");
		lblGold.setFont(new Font("Arial", Font.BOLD, 12));
		lblGold.setBounds(219, 21, 28, 14);
		contentPane.add(lblGold);
		
		JLabel lblScore_2_1 = new JLabel("Number of days:");
		lblScore_2_1.setFont(new Font("Arial", Font.BOLD, 12));
		lblScore_2_1.setBounds(300, 21, 92, 14);
		contentPane.add(lblScore_2_1);
		
		Button button_2 = new Button("New game");
		button_2.setBounds(141, 215, 70, 22);
		contentPane.add(button_2);
		
		Button button_3 = new Button("Next day");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gc.healMonster();
				gc.setCurrentDay(gc.getCurrentDay()+1);
				try {
					JLabel lblNewLabel_2 = new JLabel("Monster's team was heal.");
					lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
					lblNewLabel_2.setBounds(55, 138, 279, 14);
					contentPane.add(lblNewLabel_2);
					Thread.sleep(200);
					JLabel lblNewLabel_2_1 = new JLabel("Let's fight some battle!");
					lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 13));
					lblNewLabel_2_1.setBounds(55, 163, 279, 14);
					contentPane.add(lblNewLabel_2_1);
					Thread.sleep(200);
					JLabel lblNewLabel_2_1_1 = new JLabel("Let's gooooo!");
					lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
					lblNewLabel_2_1_1.setBounds(55, 188, 279, 14);
					contentPane.add(lblNewLabel_2_1_1);
					Thread.sleep(200);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				gc.launchMainScreen();
				closeAndDestoryCurrentScreen();
				
			}
		});
		button_3.setBounds(230, 215, 70, 22);
		contentPane.add(button_3);
		
		JLabel lblNewLabel = new JLabel(this.gc.getPlayerName());
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(55, 20, 61, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel(Integer.toString(this.gc.getPoint()));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(165, 21, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(Integer.toString(this.gc.getGold()));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(244, 20, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel(Integer.toString(this.gc.getCurrentDay()) + "/" + Integer.toString(this.gc.getTotalDay()));
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(393, 20, 31, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton = new JButton("Shop");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gc.launchToShop();
				closeAndDestoryCurrentScreen();
			}
		});
		btnNewButton.setBounds(133, 86, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Battle");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gc.launchBattle();
				closeAndDestoryCurrentScreen();
			}
		});
		btnNewButton_1.setBounds(27, 86, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}
	public void show(Boolean visible) {
		this.contentPane.setVisible(visible);
	}
	@SuppressWarnings("deprecation")
	private void closeAndDestoryCurrentScreen() {
		show(false);
		
	}
}