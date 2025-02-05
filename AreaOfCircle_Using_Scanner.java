package asignment_ab49;

import java.util.Scanner;

public class AreaOfCircle_Using_Scanner {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of radius r: ");
		int r=		s1.nextInt();
		double pi=3.14;
		double c=pi*r*r;
		System.out.println("Addition of two numbers using Scanner is "+c);
	}

}
