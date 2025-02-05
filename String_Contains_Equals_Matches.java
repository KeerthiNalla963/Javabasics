package asignment_ab49;

public class String_Contains_Equals_Matches 
{
	public static void main(String[] args) {
		String s1="Keerthi Nalla";
		System.out.println(s1.contains("Nalla"));
		System.out.println(s1.equals("Keerthi"));
		System.out.println(s1.equalsIgnoreCase("KEERTHI NALLA"));
		System.out.println(s1.matches("Keerthi Nalla"));
	}
}
