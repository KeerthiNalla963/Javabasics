package asignment_ab49;

abstract class Amazon
{
	abstract void login();//abstract method
}

public class Abstract_Method extends Amazon
{

	@Override
	void login() {
		System.out.println("Login successfull");//overridden
		
	}
	
	public static void main(String[] args) {
		Abstract_Method a1 =new Abstract_Method();
		a1.login();
		
	}
}
