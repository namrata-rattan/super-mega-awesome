package classWork;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;;

public class CustomShape extends JFrame {
	
	CustomPanel customPanel = new CustomPanel();
	public CustomShape() {
		this.add(customPanel);
		this.setSize(400,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	class CustomPanel extends JPanel {

		@Override
		protected void paintComponent(Graphics g) {
			g.drawLine(0, 0, 100, 100);
			g.drawString("Hello friends", 0, 22);

		}
	}
	public static void main(String[] args) {
		CustomShape customShape = new CustomShape();
		customShape.setVisible(true);
	}

}

