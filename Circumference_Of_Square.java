package asignment_ab49;

import java.util.Scanner;

public class Circumference_Of_Square {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of r:");
		double r = 		s1.nextDouble();
		double pi=3.14;
		double COS=2*pi*r;
		System.out.println("The circumference of Square is "+COS);
	}
}
