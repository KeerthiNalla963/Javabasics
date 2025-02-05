package asignment_ab49;
interface api1
{
	abstract void AmazonLogin();
}
interface api2 extends api1
{
	abstract void GmailLogin();
}

public class Interface_Interface implements api2
{

	@Override
	public void AmazonLogin() {
		System.out.println("Successfully logged into Amazon");
	}

	@Override
	public void GmailLogin() {
		System.out.println("Successfully logged into Gmail");
		
	}
	

}
