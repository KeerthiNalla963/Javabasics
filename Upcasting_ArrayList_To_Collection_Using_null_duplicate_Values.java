package asignment_ab49;

import java.util.ArrayList;
import java.util.Collection;

public class Upcasting_ArrayList_To_Collection_Using_null_duplicate_Values {
	public static void main(String[] args) {
		//Allows null and duplicate values
		Collection<Integer> n1=new ArrayList<Integer>();
		n1.add(876);
		n1.add(5654);
		n1.add(null);
		n1.add(23);
		n1.add(67853);
		n1.add(null);
		n1.add(23);
		System.out.println(n1);
		
	}

}
