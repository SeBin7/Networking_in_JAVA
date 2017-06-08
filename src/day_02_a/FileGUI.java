package day_02_a;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileGUI extends Frame implements ActionListener {
	//Frame f1 = new Frame();
	Button b1 = new Button("파일 READ");
	Button b2 = new Button("파일 Save");
	TextArea ta1 = new TextArea(); 	
	
	public FileGUI() {
		this.setLayout(null);		//자유배치
		
		b1.setSize(100, 70);
		b1.setForeground(new Color(244,255,255));
		b1.setBackground(new Color(0,0,255));
		b1.setFont(new Font("돋음", Font.BOLD, 20));
		b1.setLocation(380, 300);
		this.add(b1);
		b1.addActionListener(this);
		
		b2.setSize(100, 70);
		b2.setForeground(new Color(244,255,255));
		b2.setBackground(new Color(0,0,255));
		b2.setFont(new Font("돋음", Font.BOLD, 20));
		b2.setLocation(380, 400);
		this.add(b2);
		b2.addActionListener(this);
		
		ta1.setSize(300,340);
		ta1.setForeground(new Color(0,0,255));
		ta1.setBackground(new Color(255,250,0));
		ta1.setLocation(20, 40);		
		this.add(ta1);
		
		this.setSize(500, 500);
		this.setBackground(new Color(255,0,0));
		this.setTitle("TT");
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			String fileData = "";
			FileDialog fd = new FileDialog(this, "파일 열기...", FileDialog.LOAD);
			fd.setVisible(true);
			String dirfile = fd.getDirectory() + fd.getFile();
			
			
			try {
				FileReader fr = new FileReader(dirfile);
				BufferedReader br = new BufferedReader(fr);
				String s;
				
				while((s = br.readLine()) != null) {
					fileData += s+"\n";				
				}
				
				ta1.setText(fileData);
				br.close();
				fr.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		} else if (e.getSource() == b2) {
			String fileData = ta1.getText();
			FileDialog fd = new FileDialog(this, "파일 저장...", FileDialog.SAVE);
			fd.setVisible(true);
			String dirfile = fd.getDirectory() + fd.getFile();
			
			try {
				FileWriter fw = new FileWriter(dirfile);
				PrintWriter pw = new PrintWriter(fw);
				pw.println(fileData);                                                                                                             
				pw.close();
				fw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}

			
		}
	}
	
	public static void main(String[] args) {
		FileGUI f = new FileGUI();

	}

}
