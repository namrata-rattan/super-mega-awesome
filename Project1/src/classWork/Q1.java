package classWork;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q1 extends JFrame {
	JPanel[] jpanels = new JPanel[3];

	public Q1() {
		for (int i = 0; i < 3; i++)
			jpanels[i] = new JPanel();
		jpanels[0].setLayout(new GridLayout(2, 1, 1, 0));
		jpanels[0].add(new JCheckBox("Snap to Grid"));
		jpanels[0].add(new JCheckBox("Show Grid"));

		jpanels[1].setLayout(new GridLayout(2, 2));
		jpanels[1].add(new JLabel("X:", JLabel.CENTER));
		jpanels[1].add(new JTextField("8", 2));
		jpanels[1].add(new JLabel("Y:", JLabel.CENTER));
		jpanels[1].add(new JTextField("8", 2));

		jpanels[2].setLayout(new GridLayout(3, 1, 0, 5));
		jpanels[2].add(new JButton("OK"));
		jpanels[2].add(new JButton("Cancel"));
		jpanels[2].add(new JButton("Help"));

		this.setLayout(new FlowLayout());
		this.add(jpanels[0]);
		this.add(jpanels[1]);
		this.add(jpanels[2]);

	}

	public static void main(String[] args) {
		Q1 myFrame = new Q1();
		myFrame.setTitle("Align");
		myFrame.pack();
		myFrame.setLocationRelativeTo(null);
		myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setResizable(false);

	}

}
