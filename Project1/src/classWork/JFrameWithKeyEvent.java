package classWork;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameWithKeyEvent extends JFrame {
	private KeyPanel keyPanel = new KeyPanel();

	public JFrameWithKeyEvent() {
		keyPanel.setFocusable(true);
		this.add(keyPanel);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrameWithKeyEvent frame = new JFrameWithKeyEvent();
		frame.setVisible(true);

	}

	class KeyPanel extends JPanel {
		private char key = 'A';

		public KeyPanel() {
			this.addKeyListener(new KeyPanelListner());
		}

		@Override

		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 38));
			g.drawString(String.valueOf(key), 50, 50);
		}

		class KeyPanelListner implements KeyListener {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

				key = e.getKeyChar();
				repaint();

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

		}
	}

}
