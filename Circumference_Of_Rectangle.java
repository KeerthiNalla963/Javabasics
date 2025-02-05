package asignment_ab49;

import java.util.Scanner;

public class Circumference_Of_Rectangle {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of length:");
		double l =		s1.nextDouble();
		System.out.println("Enter the value of width:");
		double w = 		s1.nextDouble();
		double COR=2*(l+w);
		System.out.println("The Circumference of Rectangle is "+COR);
	}
}
