package day_02_b;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonTest extends JFrame {

	public ButtonTest() {
		JPanel p = new JPanel();
		JButton b1 = new JButton("btn01");
		JButton b2 = new JButton("btn02");
		JButton b3 = new JButton("btn03");
		JButton b4 = new JButton("btn04");
		JButton b5 = new JButton("btn05");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		getContentPane().add(p);
	}
	public static void main(String[] args) {
		ButtonTest b = new ButtonTest();
		b.setTitle("TT");
		b.setSize(250, 200);
		b.setVisible(true);
	}

}
