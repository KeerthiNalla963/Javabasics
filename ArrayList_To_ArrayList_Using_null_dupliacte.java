package asignment_ab49;

import java.util.ArrayList;

public class ArrayList_To_ArrayList_Using_null_dupliacte {
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<Object>();
		a1.add("aaa");
		a1.add("bbb");
		a1.add(null);
		a1.add("ccc");
		a1.add("bbb");
		a1.add(null);
		//ArrayList accepts duplicate and null values
		System.out.println(a1);
	}

}
