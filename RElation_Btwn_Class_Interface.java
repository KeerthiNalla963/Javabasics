package asignment_ab49;
interface API
{
	abstract void website();
}

public class RElation_Btwn_Class_Interface implements API
{

	@Override
	public void website() {
		System.out.println("website launched successfully");
		
	}
	public static void main(String[] args) {
		RElation_Btwn_Class_Interface r1=new RElation_Btwn_Class_Interface();
		r1.website();
	}

}
