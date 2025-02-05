package asignment_ab49;
abstract class Abstract1
{
	abstract void editing();
	abstract void copying();
	void printing()
	{
		System.out.println("successfully printing");
	}
	static void publishing()
	{
		System.out.println("successfully published");
	}
}

public class Abstract_2AM_2CM extends Abstract1 
{

	@Override
	void editing() {
		System.out.println("successfully editing");
		
	}

	@Override
	void copying() {
		System.out.println("successfully copying");	
	}
	public static void main(String[] args) {
		Abstract_2AM_2CM amcm=new Abstract_2AM_2CM();
		amcm.printing();//creating object for non-static and calling
		publishing();//directly calling the static method
		amcm.copying();
		amcm.editing();
		
	}

}
