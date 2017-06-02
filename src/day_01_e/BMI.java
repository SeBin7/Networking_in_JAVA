package day_01_e;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int height, weight;
		
		System.out.print("���� �Է�(m) >>> ");
		height = scanner.nextInt();
		System.out.print("ü�� �Է� (kg)>>> ");
		weight = scanner.nextInt();
		
		//System.out.println(height + " // " + weight);
		
		double mheight = height/100.0;
		double bmi = weight/Math.pow(mheight, 2);
		
		//System.out.printf("%.2f", bmi);
		
		String result;
		if(bmi >= 30.0) 
			result = "��";
		else if(bmi >= 25.0)
			result = "��ü��";
		else if(bmi >= 20.0)
			result = "����";
		else 
			result = "��ü��";
		
		System.out.println(result);
	}

}
