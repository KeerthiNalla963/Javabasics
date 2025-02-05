package asignment_ab49;

public class Palindrome {
	public static void main(String[] args) {
		String s1="madam";
		String output="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c1=s1.charAt(i);
			output=output+c1;
		}
		System.out.println(output);
		if(s1.equals(output))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
	}
}
