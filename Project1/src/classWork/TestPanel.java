package classWork;
import java.awt.*;
import javax.*;
import javax.swing.*;

public class TestPanel extends JFrame {
	private JPanel panel = new JPanel();
	public TestPanel() {
		JButton jbt = new JButton("OK");
		panel.add(jbt);
		Color color = new Color(255,0,0);
		jbt.setForeground(color);
		jbt.setBackground(Color.BLACK);
		panel.add(new JButton("Cancle"));
		
	
		
		
		
		
		this.add(panel);
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	public static void main(String[] args) {
		new TestPanel();
		

	}

}
