package asignment_ab49;

public class Final_Variable {
	
	void add()
	{
		final  int  a =56;//Final is mentioned at the variable so the value of variable a cannot be changed
		//a = 23;
		int b=78;
		int c = a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Final_Variable v1=new Final_Variable();
		v1.add();
	}
}
