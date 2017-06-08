package day_02_c;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAdress {
	TextField inputText;
	TextArea output;
	
	public void work() {
		Frame f = new Frame("IPAdress");
		output = new TextArea();
		inputText = new TextField("이문장을 지우고 Hostname 입력");
		inputText.addActionListener(new AddressListener());
		f.add(output, "Center");
		f.add(inputText, "South");
		f.setSize(300, 400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we){
				System.exit(0);
			}
		});
		
		try {
			InetAddress inetaddr = InetAddress.getLocalHost();
			output.append("\nYour Hostname is : " + inetaddr.getHostName());
			output.append("\nYour Hostname is : " + inetaddr.getHostAddress() + "\n");
		} catch (UnknownHostException e) {
			output.append("\nError in getLocalHost \n");
		}
		
	}
	
	class AddressListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String h_name = inputText.getText();
			
			try {
				InetAddress inetaddr = InetAddress.getByName(h_name);
				output.append("\nYour Hostname is : " + inetaddr.getHostName());
				output.append("\nYour Hostname is : " + inetaddr.getHostAddress() + "\n");
			} catch (UnknownHostException e2) {
				output.append("\nError in getLocalHost \n");
			}
		}
	}
	
	public static void main(String[] args) {
		IPAdress ip = new IPAdress();
		ip.work();
	}

}


