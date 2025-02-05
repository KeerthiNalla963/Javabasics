package asignment_ab49;
interface SendMessageThruWatsap
{
	abstract void SelectContact();
}
abstract class SendingMessage implements SendMessageThruWatsap
{
	abstract void TypeText();
	abstract void SendMessage();
	
}


public class Relation_Btwn_AbstractClass_Interface extends SendingMessage
{
	public void SelectContact() {
		System.out.println("Contact has been selected");
		
	}

	@Override
	void TypeText() {
			System.out.println("Message has been typed");
	}

	@Override
	void SendMessage() {
		System.out.println("press on the send button");
	}
	public static void main(String[] args) {
		Relation_Btwn_AbstractClass_Interface r1=new Relation_Btwn_AbstractClass_Interface();
		r1.SelectContact();
		r1.TypeText();
		r1.SendMessage();
		
	}
	}

