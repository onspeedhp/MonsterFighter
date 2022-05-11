package main.java.ui;

import java.awt.*;
import java.awt.Font;
import javax.swing.*;




import main.java.controller.GameController;

import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class StartScreen extends JFrame {
	private GameController gc;
	private JPanel contentPane;
	
	@SuppressWarnings("deprecation")
	public StartScreen (GameController gc) {
		this.gc = gc;

		initialize();
		show(true);
	}
	public void show(Boolean visible) {
		contentPane.setVisible(visible);
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
		
		JTextField textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				String playerName = textField.getText();
				gc.setPlayerName(playerName);
			}
		});
		textField.setBounds(139, 51, 143, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JLabel lblNewLabel = new JLabel("Enter Player's name:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 50, 133, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblHallOfFame = new JLabel("HALL OF FAME");
		lblHallOfFame.setHorizontalAlignment(SwingConstants.CENTER);
		lblHallOfFame.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblHallOfFame.setBounds(315, 135, 92, 12);
		contentPane.add(lblHallOfFame);
		
		JLabel lblNumberOfDays = new JLabel("Number of days:");
		lblNumberOfDays.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNumberOfDays.setBounds(10, 82, 119, 21);
		contentPane.add(lblNumberOfDays);
		
		JLabel lblNewLabel_1 = new JLabel("MONSTER FIGHTER");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(85, 11, 260, 28);
		contentPane.add(lblNewLabel_1);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Easy");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					gc.setGold(500);
					gc.setPoint(100);
				}
			}
		});
		rdbtnNewRadioButton.setBounds(139, 135, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		rdbtnMedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnMedium.isSelected()) {
					gc.setGold(550);
					gc.setPoint(150);
				}
			}
		});
		rdbtnMedium.setBounds(139, 161, 109, 23);
		contentPane.add(rdbtnMedium);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("Hard");
		rdbtnNewRadioButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_1_1.isSelected()) {
					gc.setGold(600);
					gc.setPoint(200);
				}
			}
		});
		rdbtnNewRadioButton_1_1.setBounds(139, 187, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1_1);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnNewRadioButton);
		group.add(rdbtnMedium);
		group.add(rdbtnNewRadioButton_1_1);
		
		JLabel lblDifficulty = new JLabel("Difficulty:");
		lblDifficulty.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDifficulty.setBounds(10, 135, 102, 21);
		contentPane.add(lblDifficulty);
		
		
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				gc.launchWindowTitle();
				closeAndDestoryCurrentScreen();
			}
		});
		btnNewButton.setBounds(173, 217, 89, 23);
		contentPane.add(btnNewButton);
		
//		String week[]= { "Monday","Tuesday","Wednesday",
//                "Thursday","Friday","Saturday","Sunday"};

//		@SuppressWarnings("unchecked")
//		JList list = new JList(week);
//		list.setBounds(344, 164, 1, 1);
//		contentPane.add(list);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int a = slider.getValue();
				gc.setTotalDay(a);
			}
		});
		slider.setMajorTickSpacing(2);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setMinorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setMaximum(15);
		slider.setMinimum(5);
		slider.setValue(7);
		slider.setBounds(139, 70, 143, 62);
		contentPane.add(slider);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(407, 38, 17, 80);
		contentPane.add(scrollBar);
		this.gc.setCurrentDay(1);
		
	}
	
	@SuppressWarnings("deprecation")
	private void closeAndDestoryCurrentScreen() {
		show(false);
		
	}
}
