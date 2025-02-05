package asignment_ab49;

import java.util.Scanner;

public class Circumference_Of_Circle {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the value of radius: ");
		int r=		s1.nextInt();
		double pi=3.14;
		double COC=2*pi*r;
		System.out.println("Circumference of circle is "+" "+COC);
	}

}
