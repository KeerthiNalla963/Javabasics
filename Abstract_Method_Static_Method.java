package asignment_ab49;

abstract class AbstractClass
{
	abstract void planning();
	static void implementing()
	{
		System.out.println("Implementation is successfull");
	}
}

public class Abstract_Method_Static_Method extends AbstractClass
{

	@Override
	void planning() {
		System.out.println("Planning is successfull");
		
	}
	public static void main(String[] args) {
		Abstract_Method_Static_Method as1=new Abstract_Method_Static_Method();
		as1.planning();
		implementing();
	}

}
