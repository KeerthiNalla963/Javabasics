package asignment_ab49;

public class ToCheck_100_IsPartOfArray 
{
	public static void main(String[] args) {
		int[] n1=new int[3];
		n1[0]=67;
		n1[1]=87;
		n1[2]=100;
		int noToCheck=100;
		for(int i=0;i<n1.length;i++)
		{
			if(noToCheck==n1[i])
			{
				System.out.println("100 is the part of an array and its index value is  "+i);
			}
			else
			{
				System.out.println("100 is not the part of an array");
			}			
		}
	}
}
