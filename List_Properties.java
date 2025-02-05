package project_javabasics;

import java.util.ArrayList;
import java.util.List;

public class List_Properties {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("amit");
		l.add("akshay");
		l.add("nisha");
		l.add(0,"nupur");
		System.out.println(l);
		List l1=new ArrayList();
		l1.add("geetha");
		l1.add("Sireesha");
		l1.addAll(1, l);//
		
		System.out.println(l1);
		l1.remove(0);
		l1.remove("nupur");
		l1.remove(l);
		System.out.println(l1);

		

		
	}

}
