package day_02_a;

import java.awt.FileDialog;
import java.awt.Frame;

class FileDialogTest extends Frame{
	FileDialog fd;
	public FileDialogTest(String s){
		//fd = new FileDialog(this, "���� ����...", FileDialog.LOAD);
		fd = new FileDialog(this, "���� ����...", FileDialog.SAVE);
		fd.setSize(300, 300);
		fd.setVisible(true);
		System.out.println(fd.getFile());
	}	
	
	public static void main(String[] args) {
		FileDialogTest f = new FileDialogTest("");

	}
}

