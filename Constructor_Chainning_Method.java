package asignment_ab49;

public class Constructor_Chainning_Method 
{
	Constructor_Chainning_Method() 
	{
		this("Keerthi");
		System.out.println("1");
	}
	Constructor_Chainning_Method(String str)
	{
		this(32);
		System.out.println("int");
	}
	Constructor_Chainning_Method(int n)
	{
		System.out.println("End of program");
	}
	public static void main(String[] args) {
		Constructor_Chainning_Method c1=new Constructor_Chainning_Method();
	}
}
