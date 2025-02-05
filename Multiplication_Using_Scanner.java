package asignment_ab49;

import java.util.Scanner;

public class Multiplication_Using_Scanner {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of int a: ");
		int a=		s1.nextInt();
		System.out.println("enter the value of int b: ");
		int b=		s1.nextInt();
		int c=a*b;
		System.out.println("Addition of two numbers using Scanner is "+c);
	}

}
