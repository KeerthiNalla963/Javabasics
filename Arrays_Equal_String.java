package asignment_ab49;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Equal_String {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input the first array as a single string
        System.out.println("Enter elements for the first array (comma-separated):");
        String input1 = scanner.nextLine();
        String[] array1 = input1.split(","); // Split input into array elements

        // Input the second array as a single string
        System.out.println("Enter elements for the second array (comma-separated):");
        String input2 = scanner.nextLine();
        String[] array2 = input2.split(","); // Split input into array elements
        // Trim any extra whitespace around elements
        for (int i = 0; i < array1.length; i++) {
            array1[i] = array1[i].trim();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array2[i].trim();}
        // Check if the arrays are equal
        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("The two arrays are equal: " + isEqual);

       
    }
}