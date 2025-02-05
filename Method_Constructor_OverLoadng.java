package asignment_ab49;

public class Method_Constructor_OverLoadng {
	//Constructor
	Method_Constructor_OverLoadng()
	{
		System.out.println("without parameters Constructors");
	}
	Method_Constructor_OverLoadng(int a, int b)
	{
		System.out.println("with parameters Constructors");
	}
	//Method
	public static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		//Constructor Overloading
		Method_Constructor_OverLoadng n1 = new Method_Constructor_OverLoadng();
		Method_Constructor_OverLoadng n2 = new Method_Constructor_OverLoadng(2,4);
		
		
		//Method Overloading
		add(3,4);
	}

}
