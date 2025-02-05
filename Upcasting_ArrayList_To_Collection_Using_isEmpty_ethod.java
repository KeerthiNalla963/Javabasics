package asignment_ab49;

import java.util.ArrayList;
import java.util.Collection;

public class Upcasting_ArrayList_To_Collection_Using_isEmpty_ethod {
	public static void main(String[] args) {
		Collection<Integer> n1=new ArrayList<Integer>();
		n1.add(876);
		n1.add(5654);
		n1.add(23);
		n1.add(67853);
		System.out.println(n1);
		System.out.println(n1.isEmpty());
		System.out.println(n1);
		Collection<Integer> n2=new ArrayList<Integer>();
		n2.addAll(n1);
		System.out.println(n2.isEmpty());
		n2.add(456798);
		System.out.println(n2.removeAll(n1));
		System.out.println(n2);
	
	}

}
