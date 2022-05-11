package main.java.ui;




import javax.swing.border.EmptyBorder;
import main.java.controller.GameController;
import javax.swing.*;
import java.awt.*;

public class MonsterTeam extends JFrame {

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
	public MonsterTeam (GameController gc) {
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
		
		List list = new List();
		list.setBounds(36, 77, 130, 87);
		contentPane.add(list);
		
		Button button = new Button("Monster's team");
		button.setBounds(34, 10, 132, 38);
		contentPane.add(button);
		
		Button button_1 = new Button("Bag");
		button_1.setBounds(199, 10, 132, 38);
		contentPane.add(button_1);
		
		List list_1 = new List();
		list_1.setBounds(199, 77, 130, 87);
		contentPane.add(list_1);
		
		Button button_2 = new Button("Apply");
		button_2.setBounds(354, 106, 70, 22);
		contentPane.add(button_2);
		
		Button button_2_1 = new Button("Exit");
		button_2_1.setBounds(354, 211, 70, 22);
		contentPane.add(button_2_1);
	}
}
