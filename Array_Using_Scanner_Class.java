package asignment_ab49;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Using_Scanner_Class {
	public static void main(String[] args) {
		int n1[]=new int[3];
		System.out.println("Enter the values of array:");
		Scanner s1=new Scanner(System.in);
		for(int i =0;i<n1.length;i++)
		{
		n1[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(n1));
	}

}
