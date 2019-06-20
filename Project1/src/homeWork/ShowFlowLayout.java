package homeWork;

import java.awt.*;
import javax.swing.*;


public class ShowFlowLayout extends JFrame {

	JTextField[] jtxtfields = new JTextField[3];
	JLabel[] jlbls = new JLabel[3];
	private GridLayout layout = new GridLayout(3, 2, 5, 5);

	public ShowFlowLayout() {
		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT);
		this.setHGap(40);
		this.setLayout(flowLayout);

		jlbls[0] = new JLabel("First Name");
		jlbls[1] = new JLabel("MI");
		jlbls[2] = new JLabel("Last Name");

		jtxtfields[0] = new JTextField(20);
		jtxtfields[1] = new JTextField(2);
		jtxtfields[2] = new JTextField(20);

		for (int i = 0; i < 3; i++) {
			this.add(jlbls[i]);
			this.add(jtxtfields[i]);
		}
		this.setTitle("Grid Layout");
		// this.setSize(400, 150);
		pack();

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Show Flow Layout");
		this.setVisible(true);
	}

	private void setHGap(int i) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new ShowFlowLayout();
	}

}