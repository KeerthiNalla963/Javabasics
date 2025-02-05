package asignment_ab49;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Program 
{
	public static void main(String[] args) {
		Vector<Object> v1=new Vector<Object>(3);
		//Accepts Heterogeneous values
		//Accepts null values
		//Accepts duplicate values
		v1.add(null);
		v1.add("nnnnn");
		v1.add("kkkk");
		v1.add("gggg");
		v1.add("kkkk");
		v1.add(true);//Vector is dynamic in nature
		System.out.println(v1);
		System.out.println(v1.indexOf(null));//Index of
		
		//sort
		Vector<String> v2=new Vector<String>();
		v2.add("Leela");
		v2.add("Kranthi");
		v2.add("Arun");
		System.out.println("Before sorting");
		System.out.println(v2);
		v2.sort(null);
		System.out.println("After sorting");
		System.out.println(v2);
		
		//Iterator
		Iterator<String> i1=v2.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		//ListIterator
		ListIterator<Object> li1=v1.listIterator();	
		while(li1.hasNext())
		{
			System.out.println(li1.next());
		}
		
		//Enumeration
		Enumeration<String> e1=v2.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
		
}

}
