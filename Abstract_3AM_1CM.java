package asignment_ab49;
abstract class BuldingConstruction
{
	abstract void planning();
	abstract void FinalizeByEngineer();
	abstract void BulderHandOver();
	void ConstructionBegin()
	{
		System.out.println("successfully started the construction");
	}	
}
public class Abstract_3AM_1CM extends BuldingConstruction
{
	void planning() {
		System.out.println("successfully planned");	
	}
	void FinalizeByEngineer() {
		System.out.println("successfully finalized by engineer");	
	}
	void BulderHandOver() {
		System.out.println("successfully handed over");
	}
	public static void main(String[] args) {
		Abstract_3AM_1CM am3cm1=new Abstract_3AM_1CM();
		
		am3cm1.BulderHandOver();
		am3cm1.ConstructionBegin();
		am3cm1.FinalizeByEngineer();
		am3cm1.planning();
	}

}
