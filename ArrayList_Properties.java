package asignment_ab49;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Properties {
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<Object>(4);
		//Stores Heterogeneous values
		//sort cannot be done heterogeneous values but can be done homogeneous values
		a1.add("Seetha");
		a1.add(786);
		a1.add(2, 'g');
		a1.add('h');
		a1.add("Seema");
		a1.add("Neha");
		a1.add(null);
		a1.add(null);//accepts duplicate and null values
		System.out.println(a1);//Dynamic//Though the size is 4,still it is taking elements
		System.out.println(a1.indexOf("Seetha"));//to find the index
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(34);
		a2.add(46);
		a2.add(76);
		a2.add(24);
		a2.add(98);
		System.out.println(a2);
		Collections.sort(a2);
		System.out.println(a2);
		
		Iterator<Integer> i1=a2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		ListIterator<Object> l1=a1.listIterator();
		while(l1.hasNext())
		{
			System.out.println(l1.next());
		}
		
		//Ennumeration doesn't work with ArrayList
//		Enumeration<String> e1=v.elements();
//		while(e1.hasMoreElements())
//		{
//			System.out.println(e1.nextElement());
//		}
	}

}
