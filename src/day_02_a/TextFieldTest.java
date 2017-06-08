package day_02_a;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

class TextFieldTest{
	
	public static void main(String[] args) {
		
		Frame f = new Frame("TextField Ex");
		f.setLayout(new FlowLayout());
		
		TextField tf = new TextField("초기문자열", 20);
		tf.setEchoChar('*');
		
		f.add(tf);
		f.setSize(300, 300);
		f.setTitle("TT");
		f.setVisible(true);
	}
}

