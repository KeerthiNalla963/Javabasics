package asignment_ab49;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue_Properties {
	public static void main(String[] args) {
		//PriorityQueue accepts homogeneous values
		PriorityQueue<String> p1=new PriorityQueue<String>();
		p1.add("Keerthi");
		p1.add("Nalla");
		p1.add("Kumar");
		p1.add("Sakin");
		System.out.println(p1);
		
		//doesn't follow indexing
		//doesn't accept null 
		//accepts duplicate values
		//doesn't have sort method
		// PriorityQueue works with integers
		//doesn't work with ListIterator as it is not the immediate implimented class of list
		//does not directly accept Enumeration
		PriorityQueue<String> p2=new PriorityQueue<String>();
		p2.add("kkkk");
		p2.add("nnnnn");
		p2.add("kkkk");
		
		p2.addAll(p1);
		System.out.println(p2);

		System.out.println(p2.containsAll(p1));
		System.out.println(p2);
		
		
		Iterator<String> i1=p2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	
		
	}

}
