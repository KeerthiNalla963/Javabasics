package asignment_ab49;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Set_for_int_SetProperties {
	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(9876554);
		s1.add(345);
		s1.add(9343);
		s1.add(76);
		
		System.out.println(s1);
		Iterator<Integer> i1=s1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next()); ;
		}
		
	}

}
