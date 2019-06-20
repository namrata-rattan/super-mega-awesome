package classWork;

import java.awt.BorderLayout;

import javax.swing.*;

public class TestBorderLayout extends JFrame {
	private JButton[] buttons = new JButton[5];
	BorderLayout borderlayout = new BorderLayout();
	
	public TestBorderLayout() {
		this.setLayout(borderlayout);
		
		
		buttons[0] = new JButton("North");
		buttons[1] = new JButton("EAST");
		buttons[2] = new JButton("SOUTH");
		buttons[3] = new JButton("WEST");
		buttons[4] = new JButton("CENTER");
		add(buttons[0], BorderLayout.NORTH);
		add(buttons[1], BorderLayout.EAST);
		add(buttons[2], BorderLayout.SOUTH);
		add(buttons[3], BorderLayout.WEST);
		add(buttons[4], BorderLayout.CENTER);
		
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Border Layout");
		setSize(500, 500);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new TestBorderLayout();
		

	}

}
