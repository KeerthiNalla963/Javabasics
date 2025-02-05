package asignment_ab49;

import java.util.Scanner;

public class Area_Of_Rectangle_Using_ScannerClass {
	
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of radius r: ");
		double w=		s1.nextDouble();
		System.out.println("enter the value of radius r: ");
		double l=		s1.nextDouble();
		double AOR=w*l;
		System.out.println("Area of Rectangle using Scanner is "+AOR);
		
	}

}
