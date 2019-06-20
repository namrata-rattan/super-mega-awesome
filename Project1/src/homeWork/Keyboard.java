package homeWork;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Keyboard extends JFrame {
	private JButton[] key1 = new JButton[100];
	private JTextArea textField;
	private char keyText;
	private JLabel label1;
	private JLabel label2;
	private Object[] keys;
	int keycode;
	private final char[] normalKey = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', 'q', 'w', 'e', 'r',
			't', 'y', 'u', 'i', 'o', 'p', '[', ']', '\\', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', ';', '\'', 'z',
			'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/' };
	private final char[] shiftKey = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '+', 'Q', 'W', 'E', 'R',
			'T', 'Y', 'U', 'I', 'O', 'P', '{', '}', '|', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ':', '\"', 'Z',
			'X', 'C', 'V', 'B', 'N', 'M', '<', '>', '?' };

	public Keyboard() {

		for (int i = 0; i <= 45; i++) {
			key1[i] = new JButton();
		}

		JButton Backspace = new JButton("Backspace");
		add(Backspace);
		JButton Tab = new JButton("Tab");
		add(Tab);
		JButton Q = new JButton("Q");
		add(Q);
		JButton W = new JButton("W");
		add(W);
		JButton E = new JButton("E");
		add(E);
		JButton R = new JButton("R");
		add(R);
		JButton T = new JButton("T");
		add(T);
		JButton Y = new JButton("Y");
		add(Y);
		JButton U = new JButton("U");
		add(U);
		JButton I = new JButton("I");
		add(I);
		JButton O = new JButton("O");
		add(O);
		JButton P = new JButton("P");
		add(P);

		JButton Caps = new JButton("Caps ");
		add(Caps);
		JButton A = new JButton("A");
		add(A);
		JButton S = new JButton("S");
		add(S);
		JButton D = new JButton("D");
		add(D);
		JButton F = new JButton("F");
		add(F);
		JButton G = new JButton("G");
		add(G);
		JButton H = new JButton("H");
		add(H);
		JButton J = new JButton("J");
		add(J);
		JButton K = new JButton("K");
		add(K);
		JButton L = new JButton("L");
		add(L);

		JButton Shift = new JButton("Shift");
		add(Shift);
		JButton Z = new JButton("Z");
		add(Z);
		JButton X = new JButton("X");
		add(X);
		JButton C = new JButton("C");
		add(C);
		JButton V = new JButton("V");
		add(V);
		JButton B = new JButton("B");
		add(B);
		JButton N = new JButton("N");
		add(N);
		JButton M = new JButton("M");
		add(M);

		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}
	
}

