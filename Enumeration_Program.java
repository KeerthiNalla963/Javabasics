package asignment_ab49;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Program {
	public static void main(String[] args) {
		Vector<String> v= new Vector<String>();
		v.add("llll");
		v.add("jjjj");
		Enumeration<String> e1=v.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}

}
