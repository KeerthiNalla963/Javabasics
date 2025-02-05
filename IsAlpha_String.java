package asignment_ab49;

public class IsAlpha_String {
	
	static int countofSpaces=0;
	public static void main(String[] args) {
		String s1="kv no 3";
		int countofAlpha=0;
		 
		char[] c1=s1.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			boolean b1=Character.isAlphabetic(c1[i]);
			if(b1==true)
			{
				//System.out.println("Count of Alpha is ");
				countofAlpha++;
			}
			boolean b2=Character.isWhitespace(c1[i]);
			if(b2==true)
			{
				countofSpaces++;
			}
		}
		System.out.println("Count of Alphabets are "+countofAlpha);
		System.out.println("Count of Spaces are "+countofSpaces);

	}

}
