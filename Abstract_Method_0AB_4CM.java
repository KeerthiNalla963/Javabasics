package asignment_ab49;
abstract class ABSTRCT
{
	void add()
	{
		System.out.println("Addition");
	}
	static void mul()
	{
		System.out.println("Multiplication");
	}
	void div()
	{
		System.out.println("Division");
	}
	static void sub()
	{
		System.out.println("Subtraction");
	}
}

public class Abstract_Method_0AB_4CM extends ABSTRCT 
{
	public static void main(String[] args) {	
	Abstract_Method_0AB_4CM a1=new Abstract_Method_0AB_4CM();
	a1.add();
	a1.div();
	sub();
	mul();
	}
}
