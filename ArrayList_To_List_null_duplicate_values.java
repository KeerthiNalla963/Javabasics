package asignment_ab49;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_To_List_null_duplicate_values {
	public static void main(String[] args) {
		List<Object> l1=new ArrayList<Object>();
		l1.add("Keerthi");
		l1.add("Nalla");
		l1.add(null);
		l1.add("Nalla");
		l1.add(null);
		System.out.println(l1);
	}

}
