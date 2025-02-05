package asignment_ab49;

public class Final_Keyword {
	final int a=12;
	//a=90;//this is not possible bcoz once variable is mentioned final,value cannot be changed
	final void add()
	{
		int a=45;
		int b=90;
		System.out.println(a+b);
	}
	final class Final extends Final_Keyword
	{
//		final void add()////this is not possible bcz methods cannot be overridden
//		{
//			int a=45;
//			int b=90;
//			System.out.println(a+b);
//		}
	}
//	class final1 extends Final//class cannot be inherited bcz parent class is final
//	{
//		
//	}
	public static void main(String[] args) {
		Final_Keyword f1=new Final_Keyword();
		
		
	}

}
