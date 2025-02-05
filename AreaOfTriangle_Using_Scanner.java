package asignment_ab49;

import java.util.Scanner;

public class AreaOfTriangle_Using_Scanner {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of breadth b: ");
		int b=		s1.nextInt();
		System.out.println("enter the value of height h: ");
		int h=		s1.nextInt();
		
		double c=0.5*b*h;
		System.out.println("Addition of two numbers using Scanner is "+c);
	}
}
