package asignment_ab49;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_Properties 
{
	public static void main(String[] args) {
		PriorityQueue<Object> pq1=new PriorityQueue<Object>();
		//pq1.add("kkkk");
		//pq1.add(null);//not allowed
		pq1.add(8776);
		pq1.add(78);//dynamic
		//pq1.add(true);
		//pq1.add(9.8);
		//pq1.contains("kkkk");
		System.out.println(pq1.isEmpty());
		System.out.println(pq1);	
	//using Iterator
	PriorityQueue<Integer> pq2 =new PriorityQueue<Integer>();
	pq2.add(89);
	pq2.add(78);	
	Iterator<Integer> i1=pq2.iterator();
	while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	//listiterator not applicable
	//Enumeration not applicable
	}
}
