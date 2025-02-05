package asignment_ab49;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Upcasting_ArrayList_To_List_Using_Int_values {
	public static void main(String[] args) {
		 // Step 2: Convert ArrayList to List
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(89765);
		l1.add(765);
		l1.add(3);
		System.out.println(l1);
		System.out.println("Iterating through -->");
        // Step 3: Use a ListIterator to traverse the list
        ListIterator<Integer> listIterator = l1.listIterator();	
		while(listIterator.hasNext())
		{
			System.out.println(listIterator.next());
		}
		
	}

}
