package asignment_ab49;

class C
{
	static void add()
	{
		System.out.println("Addition");
	}
}
class B extends C
{
	static void mul()
	{
		System.out.println("Multiplication");
	}
}

public class Multi_Level_Inheritance extends B
{
	static void div()
	{
		System.out.println("Division");
	}
	public static void main(String[] args) {
		div();
		mul();
		add();
		
		
		
		
		
		
	}

}
