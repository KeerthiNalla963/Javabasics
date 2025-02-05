package asignment_ab49;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Properties 
{
	public static void main(String[] args) {
		//Stores homogeneous values
		//Doesn't accepts duplicates and null values
		//Doesn't do sorting
		////doesn't work with ListIterator as it is not the immediate implimented class of list
		///does not directly accept Enumeration
		TreeSet<Object> t1=new TreeSet<Object>();
		//t1.add(null);
		t1.add("Sita");
		//t1.add('c');
		//t1.add(9866);
		//Collections.sort(t1);
		t1.add("Sita");
		t1.add("Ram");
		
		System.out.println(t1);
		
		Iterator<Object> i1=t1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
}
