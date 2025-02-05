package asignment_ab49;
class Parent1
{
	void bool()
	{
		System.out.println("true");
	}
}
public class Method_overriding 
{
	void bool()
	{
		System.out.println("false");
	}
	public static void main(String[] args) {
		Method_overriding m1=new Method_overriding();
		m1.bool();
	}

}
