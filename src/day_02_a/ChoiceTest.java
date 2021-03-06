package day_02_a;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

class ChoiceTest{
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		CheckboxGroup cbg = new CheckboxGroup();
		Checkbox c1 = new Checkbox("item1", cbg, true);
		Checkbox c2 = new Checkbox("item2", cbg, false);
		Checkbox c3 = new Checkbox("item3", cbg, false);

		f.setLayout(new FlowLayout());
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.setTitle("TT");
		f.pack();
		f.setVisible(true);
	}
}

