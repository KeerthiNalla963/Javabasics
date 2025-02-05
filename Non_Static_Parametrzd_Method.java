package asignment_ab49;

public class Non_Static_Parametrzd_Method 
	{	
	void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	void sub(int a,int b) 
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		Non_Static_Parametrzd_Method n1 = new Non_Static_Parametrzd_Method();
		n1.add(56, 76);
		n1.sub(87, 45);
	}

}
