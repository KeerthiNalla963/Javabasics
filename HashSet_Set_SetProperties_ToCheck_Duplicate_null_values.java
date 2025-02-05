package asignment_ab49;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Set_SetProperties_ToCheck_Duplicate_null_values {
	public static void main(String[] args) {
		Set<Object> s1=new HashSet<Object>();
		s1.add("Keerthi");
		s1.add("Nalla");
		s1.add("Shruthi");
		s1.add("Spoorthy");
		s1.add(766.77);
		s1.add(true);
		s1.add('f');
		Set<Object> s2=new HashSet<Object>();
		s2.add("Kumar");
		s2.add("Sakinala");
		s2.addAll(s1);
		System.out.println(s2.containsAll(s1));
		System.out.println(s2);
		
	}

}
