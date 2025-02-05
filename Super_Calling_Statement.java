package asignment_ab49;

class Parent
{
	Parent()
	{
		System.out.println("Acknowledge");
	}
}
class Child extends Parent
{
	Child(String s1)
	{
		System.out.println("Sign");
	}
}
class SuperChild extends Child
{
	SuperChild()
	{
		super("Keerthi");
		System.out.println("Proceed");
	}
}
public class Super_Calling_Statement extends SuperChild
{
	public Super_Calling_Statement() {
		System.out.println("kkk");
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Super_Calling_Statement s1=new Super_Calling_Statement();
		
	}
}
