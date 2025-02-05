package asignment_ab49;

import java.util.Scanner;

public class Scanner_Addition {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the value of int a: ");
		int a=		s1.nextInt();
		System.out.println("enter the value of int b: ");
		int b=		s1.nextInt();
		int c=a+b;
		System.out.println("Addition of two numbers using Scanner is "+c);
		
		System.out.println("enter the value of double d: ");
		double d=		s1.nextDouble();
		System.out.println("enter the value of double e: ");
		double e=		s1.nextDouble();
		int f=a+b;
		System.out.println("Addition of two numbers using Scanner is "+f);
		
		System.out.println("enter the value of float g: ");
		float g=		s1.nextFloat();
		System.out.println("enter the value of float h: ");
		float h=		s1.nextFloat();
		float i=g+h;
		System.out.println("Addition of two numbers using Scanner is "+i);
		
		System.out.println("enter the value of string j: ");
		String k=			s1.next();
		System.out.println("enter the value of string l: ");
		String l=			s1.next();
		String m =k+l;
		System.out.println("Addition of two numbers using Scanner is "+" "+m);
		
		System.out.println("enter the value of Byte j: ");
		Byte n=			s1.nextByte();
		System.out.println("enter the value of Byte l: ");
		Byte o=			s1.nextByte();
		int p =n+o;
		System.out.println("Addition of two numbers using Scanner is "+p);
		
		
		
		
	}

}
