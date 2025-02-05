package asignment_ab49;

public class Logical_Operators 
{
	public static void main(String[] args) 
	{
		//AND operator
		int a =90;
		int b =89;
		if(a>10 && b>20)
		{
			System.out.println("a and are greater numbers");
		}
		////OR operator
		if(a>10 || b>20)
		{
			System.out.println("a and are smaller numbers");
		}
		//NOT operator
		if(!(a<10 || b<20))
		{
			System.out.println("a and are not equal");
		}
	
}

}
