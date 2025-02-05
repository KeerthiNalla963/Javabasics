package asignment_ab49;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
	public static void main(String[] args) {
		int[] n1=new int[3];
		System.out.println("enter the vqalue of an array:");
		Scanner s1=new Scanner(System.in);
		
		int[] n2 =new int[3];
		for(int i=0,j=2;i<n1.length;i++,j--)
		{
			n1[i]=s1.nextInt();
			n2[j]=n1[i];
		}

		System.out.println("Enter the values of an array:");
		System.out.println(Arrays.toString(n2));
	}
}
