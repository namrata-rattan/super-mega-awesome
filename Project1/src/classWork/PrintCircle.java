package classWork;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrintCircle extends JFrame {

	CustomPanel panel1 = new CustomPanel();

	public PrintCircle() {
		this.add(panel1);
		this.setSize(500, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	class CustomPanel extends JPanel {
		
		@Override
		protected void paintComponent(Graphics g) {
			g.drawOval(100, 50, 250, 250);
			g.drawOval(150, 100, 60, 60);
			g.drawOval(250, 100, 60, 60);
			g.fillOval(160, 110, 40, 40);
			g.fillOval(260, 110, 40, 40);
			g.drawPolygon(new int[] {210, 240, 230}, new int[] {220, 220, 180}, 3);
			g.drawArc(130, 100, 190, 140, 180,160);
			g.drawArc(130, 100, 170, 180, 180,160);
			
			

		}
	}

		
	

	public static void main(String[] args) {
		PrintCircle customShape = new PrintCircle();
		customShape.setVisible(true);
	}
}
