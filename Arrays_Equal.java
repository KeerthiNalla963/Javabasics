package asignment_ab49;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Equal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String[] array1 = new String[size1];
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextLine();
        }
        // Input for the second array
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String[] array2 = new String[size2];
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextLine();
        }

        // Check if the arrays are equal
        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("The two arrays are equal: " + isEqual);

        
    

	}

}
