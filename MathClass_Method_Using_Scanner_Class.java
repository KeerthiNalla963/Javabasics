package asignment_ab49;

import java.util.Scanner;

public class MathClass_Method_Using_Scanner_Class {
	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a =		s1.nextInt();
		System.out.println("Enter the value of b:");
		int b= 		s1.nextInt();
		System.out.println(Math.min(a, b));
		System.out.println(Math.max(a, b));
		System.out.println(Math.abs(a));
	}

}
