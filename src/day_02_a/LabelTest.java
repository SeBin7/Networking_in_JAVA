package day_02_a;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

class LabelTest{
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		Label l1 = new Label("Label 1..");
		Label l2 = new Label("Label 2..");
		l2.setFont(new Font("Arial", Font.BOLD, 20));
		
		f.add("North", l1);
		f.add("South", l2);
		f.setSize(300, 300);
		f.setTitle("TT");
		f.setVisible(true);
	}
}

