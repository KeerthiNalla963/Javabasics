package asignment_ab49;


class E
{
	void add()
	{
		System.out.println("Addition");
	}
}
class D extends E
{
	void mul()
	{
		System.out.println("Multiplication");
	}
}
public class Hierachial_Inheritance extends E
{
	 void sub()
	{
		System.out.println("Subtraction");
	}
	public static void main(String[] args) {
		Hierachial_Inheritance h1=new Hierachial_Inheritance();
		h1.add();
		h1.sub();
		
		
	}

}
