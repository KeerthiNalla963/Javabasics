package asignment_ab49;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_To_Set_using_Iterator {
	public static void main(String[] args) {
		Set<Object> s1=new HashSet<Object>();
		s1.add("Keerthi");
		s1.add(4875);
		s1.add(true);
		System.out.println(s1);
		System.out.println("After the iteration --->");
		Iterator<Object> i1=s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
