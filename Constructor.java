package asignment_ab49;


public class Constructor {
	Constructor()
	{
		System.out.println("without parameters Constructors");
	}
	Constructor(int a, int b)
	{
		System.out.println("with parameters Constructors");
	}
	public static void main(String[] args) {
		Constructor n1=new Constructor();
		Constructor n2 = new Constructor(5,6);
		n1.getClass();
		n2.getClass();
	}

}
