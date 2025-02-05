package asignment_ab49;

public class StringBuffer_StringBuilder 
{
	public static void main(String[] args) 
	{
	
		//String_Concat
	String n1 =new String("Keerthi");
	String n=	n1.concat("Nalla");
	System.out.println(n1);
	
	//String_Buffer
	StringBuffer n2=new StringBuffer("Keerthi");
	System.out.println(n2.append(" Sakinala"));
	
	//String_Bulder
	StringBuilder s1= new StringBuilder("Pinky");
	s1.append(" Bonala");
	System.out.println(s1);
	}
}
