package asignment_ab49;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1="spot";
		String s2="stop";
		if(s1.length()==s2.length())
		{
			System.out.println("It is an anagram");
		}
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		boolean answer=Arrays.equals(c1, c2);
		if(answer==true)
		{
			System.out.println("It is an anagram");
		}
		else
		{
			System.out.println("It is not an anagram");
		}
	}

}
