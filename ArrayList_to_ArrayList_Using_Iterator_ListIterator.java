package asignment_ab49;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_to_ArrayList_Using_Iterator_ListIterator {
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add("kkk");
		a1.add(8779);
		System.out.println(a1);
		System.out.println("After the Iteration -->");
		Iterator<Object> i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		System.out.println("After the ListIteration -->");
		
		
		ListIterator<Object> l1=a1.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		
		
	}

}
