package day_02_a;

import java.awt.Frame;

class HelloAwt extends Frame{
	public HelloAwt(String s){
		super(s);
	}	
	
	public static void main(String[] args) {
		HelloAwt f = new HelloAwt("TT");
		f.setSize(200, 200);
		//f.setTitle("TT");
		f.setCursor(12);
		f.setVisible(true);
	}
}

