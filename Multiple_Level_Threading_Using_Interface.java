package asignment_ab49;

interface a1
{
	abstract void apikey2();
}
interface a2 extends a1
{
	abstract void apikey2();
}

public class Multiple_Level_Threading_Using_Interface implements a1,a2
{
	public void apikey1() {
		System.out.println("apikey1");
		
	}

	public void apikey2() {
		System.out.println("apikey2");
		
	}
	public static void main(String[] args) {
		Multiple_Level_Threading_Using_Interface m1=new Multiple_Level_Threading_Using_Interface();
		m1.apikey2();
		m1.apikey1();
	}

	

}
