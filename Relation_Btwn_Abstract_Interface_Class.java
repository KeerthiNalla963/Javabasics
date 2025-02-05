package asignment_ab49;
interface Gmail
{
	abstract void gmaillogin();
}
abstract class Yahoo implements Gmail
{
	abstract void yahoologin();
}

public class Relation_Btwn_Abstract_Interface_Class extends Yahoo 
{

	@Override
	public void gmaillogin() {
		System.out.println("Successfully logged into Gmail");
	}

	@Override
	void yahoologin() {
		System.out.println("Successfully logged into Yahoo");
		
	}
	public static void main(String[] args) {
		Relation_Btwn_Abstract_Interface_Class r1 =new Relation_Btwn_Abstract_Interface_Class();
		r1.gmaillogin();
		r1.yahoologin();
	}

}
