package day_02_a;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class EasyEvent extends Frame implements ActionListener {
	Button b1;
	Frame f1;
	TextField tf1;

	public EasyEvent() {
		this.setLayout(null);		//자유배치
		b1 = new Button("오늘 점심 무엇인가?");
		b1.setBounds(20,100, 100, 30);
		b1.addActionListener(this);
		
		tf1 = new TextField();                                                                                                    
		tf1.setBounds(20, 30, 100, 30);
		
		
		f1 = new Frame();
		f1.setLayout(null);
		f1.add(b1);
		f1.add(tf1);		
		f1.setSize(500, 500);
		f1.setVisible(true);
		
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
		
	 	
	}
	
	public void actionPerformed(ActionEvent e) {
		tf1.setText("짜장!!!");
    }
	
	public static void main(String[] args) {
		EasyEvent bmi = new EasyEvent();
	}

}

