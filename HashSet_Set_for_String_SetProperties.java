package asignment_ab49;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Set_for_String_SetProperties {
	public static void main(String[] args) {
		
	
	Set<String> s1=new HashSet<String>();
	s1.add(null);
	s1.contains(null);
	s1.add("Keerthi");
	s1.add("Nalla");
	System.out.println(s1.isEmpty());
	System.out.println(s1.contains("Nalla"));
	s1.remove("Nalla");
	System.out.println(s1.hashCode());
	System.out.println(s1.getClass());
	System.out.println(s1);
	}
}
