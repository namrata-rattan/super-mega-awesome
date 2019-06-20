package classWork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameWithSimpleActionEvent extends JFrame {
	private JButton jbtOK = new JButton("OK");
	private JButton jbtCancel = new JButton("Cancel");

	public JFrameWithSimpleActionEvent() {
		JPanel jpanel = new JPanel();
		jpanel.add(jbtOK);
		jpanel.add(jbtCancel);
		

		jbtOK.addActionListener(new OkListenerClass());
		jbtCancel.addActionListener(new cancelListnerClass());

		this.add(jpanel);
		this.pack();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		JFrameWithSimpleActionEvent frame = new JFrameWithSimpleActionEvent();
		frame.setVisible(true);

	}

}

class OkListenerClass implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Ok button is clicked");

	}

}

class cancelListnerClass implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cancel button was clicked");

	}

}
