package asignment_ab49;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedList_Properties 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<Object> lh1=new LinkedHashSet<Object>();
		//Accepts heterogeneous values
		//Accepts one null
		//Doesn't accept duplicate values
		//Doesn't sort the values
		//  works with integers
		//doesn't work with ListIterator as it is not the immediate implimented class of list
		//does not directly accept Enumeration
		lh1.add("kkkk");
		lh1.add("llll");
		lh1.add(345);
		lh1.add(9.89);
		lh1.add('n');
		lh1.add(null);
		lh1.add(null);
		lh1.add(9.89);
		System.out.println(lh1);
		//Collections.sort(lh1);
		Iterator<Object> i1=lh1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
