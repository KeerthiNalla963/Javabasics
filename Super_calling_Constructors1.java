package asignment_ab49;

public class Super_calling_Constructors1 {
	
		
	Super_calling_Constructors1()
		{
			System.out.println("1");
		}
	}
		class Super_Calling_Constructors2
		{
			Super_Calling_Constructors2()
			{
				System.out.println("2");
			}
		}
		class Super_Calling_Constructors3
		{
			Super_Calling_Constructors3()
			{
				System.out.println("3");
			}
		}
	 class Keerthi extends Super_Calling_Constructors2
	{
		Keerthi()
		{
			System.out.println("4");

		}
		public static void main(String[] args) {
			Super_calling_Constructors1 n1= new Super_calling_Constructors1();
			
		}
	}

