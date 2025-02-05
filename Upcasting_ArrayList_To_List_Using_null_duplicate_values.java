package asignment_ab49;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Upcasting_ArrayList_To_List_Using_null_duplicate_values {
	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		l1.add("Keerthi");
		l1.add("nalla");
		l1.add("Spoorthy");
		l1.add("Shruthi");
		l1.add(null);
		l1.add("Shruthi");
		l1.add(null);
		System.out.println(l1);
		ListIterator<String> listiterator=l1.listIterator();
		
	}

}
