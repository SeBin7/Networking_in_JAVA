package day_02_a;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;

class TextAreaTest{
	
	public static void main(String[] args) {
		
		Frame f = new Frame("TextField Ex");
		f.setLayout(new FlowLayout());
		
		TextArea ta = new TextArea("�ʱ⹮�ڿ�", 5, 20);
		ta.append("�߰����ڿ�");

		f.add(ta);
		f.setSize(300, 300);
		f.setTitle("TT");
		f.setVisible(true);
	}
}

