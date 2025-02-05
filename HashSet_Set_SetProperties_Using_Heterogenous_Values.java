package asignment_ab49;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Set_SetProperties_Using_Heterogenous_Values {
	public static void main(String[] args) {
		Set<Object> s1=new HashSet<Object>();
		s1.add("Keerthi");
		s1.add(9889);
		s1.add(9.7879);
		s1.add(true);
		s1.add('c');
		s1.add(0.34562789);
		s1.add(null);
		System.out.println(s1);
	}

}
