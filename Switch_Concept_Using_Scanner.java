package asignment_ab49;

import java.util.Scanner;

public class Switch_Concept_Using_Scanner {
	public static void main(String[] args) {
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the value of a :");
	int a=		s1.nextInt();

	
	switch(a)
	{
	case 80:
		System.out.println("a is the greater than 80");
		break;
	case 89:
		System.out.println("a is the exact number");
		break;
	default:
		System.out.println("No number is mentioned for a");
		
	}
	
		
	}
}
