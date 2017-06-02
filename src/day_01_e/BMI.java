package day_01_e;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int height, weight;
		
		System.out.print("신장 입력(m) >>> ");
		height = scanner.nextInt();
		System.out.print("체중 입력 (kg)>>> ");
		weight = scanner.nextInt();
		
		//System.out.println(height + " // " + weight);
		
		double mheight = height/100.0;
		double bmi = weight/Math.pow(mheight, 2);
		
		//System.out.printf("%.2f", bmi);
		
		String result;
		if(bmi >= 30.0) 
			result = "비만";
		else if(bmi >= 25.0)
			result = "과체중";
		else if(bmi >= 20.0)
			result = "정상";
		else 
			result = "저체중";
		
		System.out.println(result);
	}

}
