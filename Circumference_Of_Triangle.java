package asignment_ab49;

import java.util.Scanner;

public class Circumference_Of_Triangle {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of a");
		
		
		double a=	s1.nextDouble();
		System.out.println("Enter the value of b");
		double b=	s1.nextDouble();
		System.out.println("Enter the value of c");
		double c=	s1.nextDouble();
		double COT=a*b*c;
		System.out.println("Circumference of triangle is "+COT);
	}
}
