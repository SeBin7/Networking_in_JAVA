package day_02_a;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

class CheckBoxTest{
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		Choice c = new Choice();
		c.add("item1");
		c.add("item2");
		c.add("item3");

		f.setLayout(new FlowLayout());
		f.add(c);
		f.setTitle("TT");
		f.pack();
		f.setVisible(true);
	}
}

