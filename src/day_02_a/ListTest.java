package day_02_a;

import java.awt.List;
import java.awt.FlowLayout;
import java.awt.Frame;

class ListTest{
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		
		List l = new List(4, false);
		l.add("item1");
		l.add("item2");
		l.add("item3");
		l.select(1);
		
		
		f.add(l);
		f.setTitle("TT");
		
		f.pack();
		f.setVisible(true);
	}
}

