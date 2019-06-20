package homeWork;
import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
public class drawingComponent extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Rectangle rect1 = new Rectangle(5,5, 100, 200);
		g2.draw(rect1);
		
	}
	
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setSize(640, 480);
		window.setTitle("This is a frame");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		drawingComponent DC = new drawingComponent();
		window.add(DC);
		
		
		
		
		
		
	}

}
