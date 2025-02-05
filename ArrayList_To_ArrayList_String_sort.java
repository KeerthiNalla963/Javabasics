package asignment_ab49;

import java.util.ArrayList;

public class ArrayList_To_ArrayList_String_sort {
	public static void main(String[] args) {
		ArrayList<String> a1 =new ArrayList<String>();
		a1.add("Keerthi");
		a1.add("Spoorthy");
		a1.add("Shruthi");
		a1.add("Nalla");
		//ArrayList follows order of insertion
		System.out.println(a1);
		a1.sort(null);
		System.out.println(a1);
	}

}
