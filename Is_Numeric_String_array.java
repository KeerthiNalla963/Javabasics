package asignment_ab49;

public class Is_Numeric_String_array {
	static int countofNumbers=0;
	public static void main(String[] args) {
		String s1="kv no 377";
		
		 
		char[] c1=s1.toCharArray();
		for(int i=0;i<c1.length;i++)
		{
			boolean b1=Character.isDigit(c1[i]);
			if(b1==true)
			{
				countofNumbers++;
			}
			
		}
		System.out.println("Count of Numbers are "+countofNumbers);

	}
}
