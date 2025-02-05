package asignment_ab49;

import java.util.ArrayList;

public class ArrayList_To_ArrayList_Int_ToCheck_OrderOfInsertion_sort {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(98767);
		a1.add(8787);
		a1.add(78);
		a1.add(8);
		a1.add(746589);
		//ArrayList follows order of insertion
		System.out.println(a1);
		a1.sort(null);
		System.out.println("After sorting-->"+a1);
	}

}
