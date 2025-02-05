package asignment_ab49;

public class Reverse_A_String {
	public static void main(String[] args) {
		String s1="Keerthi Nalla";
		String output="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			char c1=s1.charAt(i);
			output=output+c1;
		}
		System.out.println("Reverse of a string is -->"+output);
	}

}
