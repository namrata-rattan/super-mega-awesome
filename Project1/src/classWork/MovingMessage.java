package classWork;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovingMessage extends JFrame {
	MessagePanel messagePanel = new MessagePanel();

	public MovingMessage() {

		this.add(messagePanel);
		this.setSize(400, 300);
		this.setLocation(1900, 200);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovingMessage frame = new MovingMessage();
		frame.setVisible(true);
	}

	class MessagePanel extends JPanel {
		private int x = 50;
		private int y = 50;

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Hi", x, y);

		}

		class MouseListnerClass implements MouseMotionListener {
			@Override
			public void mouseDragged(MouseEvent e) {
				
				 Point point = e.getPoint();
				 x = point.x;
				 y = point.y;
				 
				 
			}

			@Override
			public void mouseMoved(MouseEvent e) {
				
			}
			
		}
		

	}

}
