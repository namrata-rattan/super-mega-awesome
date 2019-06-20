package classWork;

import java.awt.*;
import javax.*;
import javax.swing.*;

public class Align extends JFrame {
	private JPanel buttonPanel = new JPanel();
	JTextField jTextField = new JTextField();
	JButton[] jButtons = new JButton[16];
	Dimension buttonsDim;

	public Align() {
		for (int i = 0; i < 3; i++) {
			jButtons[i] = new JButton(String.valueOf(i + 7));
			jButtons[i + 4] = new JButton(String.valueOf(i + 4));
			jButtons[i + 8] = new JButton(String.valueOf(i + 1));
			jButtons[3] = new JButton("/");
			jButtons[7] = new JButton("*");
			jButtons[11] = new JButton("-");
			jButtons[12] = new JButton("0");
			jButtons[13] = new JButton(".");
			jButtons[14] = new JButton("=");
			jButtons[15] = new JButton("+");

			buttonPanel.setLayout(new GridLayout(4, 4));
			buttonsDim = new Dimension(50, 50);
			for (int i1 = 0; i1 < 16; i1++) {
				jButtons[i1].setPreferredSize(buttonsDim);
				buttonPanel.add(jButtons[i1]);

			}
			this.add(jTextField, BorderLayout.CENTER);
			this.add(buttonPanel, BorderLayout.SOUTH);
		}
		Align myFrame = new Align();
		myFrame.setTitle("calculator");
		myFrame.pack();
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(3);
		myFrame.setVisible(true);
		myFrame.setResizable(false);
	}
	public static void main(String[] args) {
	 new Align() ;
	
	
}
}
