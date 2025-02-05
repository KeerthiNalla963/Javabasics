package asignment_ab49;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Properties 
{
	public static void main(String[] args) {
		//Accepts heterogeneous values
		//Doesn't follow indexing and order of insertion
		//Accepts null
		//Doesn't allow duplicates
		//Doesn't sort the elements
		//can be iterated through iterator
		//doesn't work with ListIterator as it is not the immediate implimented class of list
		//does not directly accept Enumeration
		HashSet<Object> h1=new HashSet<Object>();
		h1.add("Sita");
		h1.add(678);
		h1.add("Jittu");
		h1.add(null);
		h1.add("Jittu");
		//Collections.sort(h1);
		System.out.println(h1);
		
		Iterator<Object> i1=h1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
	}
}
