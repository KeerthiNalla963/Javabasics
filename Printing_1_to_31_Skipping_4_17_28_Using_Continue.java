package asignment_ab49;

public class Printing_1_to_31_Skipping_4_17_28_Using_Continue {
	
	public static void main(String[] args) {
		for(int i=1;i<=31;i++)
		{
			if(i==4||i==17||i==28)
			{
				i++;
				continue;
			}
			System.out.println(i);
		}
	}

}
