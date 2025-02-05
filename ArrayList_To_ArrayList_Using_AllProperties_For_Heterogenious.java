package asignment_ab49;

import java.util.ArrayList;

public class ArrayList_To_ArrayList_Using_AllProperties_For_Heterogenious {
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add("Keerthi");
		a1.add("Nalla");
		a1.add(98767);
		a1.add(78.6868);
		System.out.println(a1.contains("Keerthi"));
		System.out.println(a1.equals("Nalla"));
		System.out.println(a1.get(1));
		ArrayList<Object> a2 =new ArrayList<Object>();
		a2.addAll(0, a1);
		System.out.println(a2);
		a2.clear();
		System.out.println(a2);
		
	}
}
