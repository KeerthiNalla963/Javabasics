package asignment_ab49;

public class String_Trim_Substring_Empty_Replace {
	public static void main(String[] args) {
		String name="Kumar Sakinala";
		String n="     Keerthi     ";
		
		System.out.println(n.trim());
		System.out.println(name.substring(4));
		System.out.println(name.substring(3, 8));
		System.out.println(n.isEmpty());
		System.out.println(name.replace('S', 'T'));
		System.out.println(name.replace("Sakinala", "Nalla"));
	}

}
