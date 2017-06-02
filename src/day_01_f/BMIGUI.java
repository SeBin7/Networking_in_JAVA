package day_01_f;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class BMIGUI2 extends Frame implements ActionListener {
	private Button b1 = new Button("BMI ���");
	private Label la1 = new Label("����� Ű��");
	private Label la2 = new Label("����� �����Դ�");
	TextField tf1 = new TextField();
	TextField tf2 = new TextField();
	TextField tf3 = new TextField();

	public BMIGUI2() {
		this.setLayout(null);
		b1.setSize(100, 70);
		b1.setLocation(200, 300);
		this.add(b1);
		b1.addActionListener(this);
		
		la1.setSize(90, 30);
		la1.setLocation(20, 70);
		this.add(la1);
		
		tf1.setSize(90, 30);
		tf1.setLocation(120, 70);
		this.add(tf1);
		
		la2.setSize(90, 30);
		la2.setLocation(20, 100);
		this.add(la2);
		
		tf2.setSize(70, 30);
		tf2.setLocation(120, 100);
		this.add(tf2);
		
		tf3.setSize(400, 500);
		tf3.setLocation(20, 400);
		this.add(tf3);
		
		this.setSize(500, 500);
		this.setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
				//c��� => exit()
				//C# => Environment.Exit()
			}
		});
		
		
	 	
	}
	
	public void actionPerformed(ActionEvent e1){
     	if(e1.getSource() == b1){ 
     		try {		
     					
	    		int  ki= Integer.parseInt(tf1.getText());
	            int  mom=Integer.parseInt(tf2.getText());
   	  
	            double mki=ki/100.0;
	            double bmi=mom / Math.pow(mki,2);
		      
		        String result;
		        
		        if(bmi >=30.0)
		        	result="��";
		        else if(bmi >=25.0)
		        	result="��ü��";
		        else if(bmi >=20.0)
		        	result="����";
		        else 
	        		result="��ü��";
		                
		        tf3.setText("����� bmi������"+bmi+"�̸� "+result+"�̱���"); 
    	   } catch(NumberFormatException e){
    		   tf3.setText("Ű�� �����Կ� ���ڸ� �־��ּ���"); 
    	   } catch(Exception e){
    		   tf3.setText(e.getMessage());
    	   }
    	}
    }

}

public class BMIGUI {

	public static void main(String[] args) {
		BMIGUI2 bmi = new BMIGUI2();
	}

}
