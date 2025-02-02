package java_exp_1;

import java.util.Scanner;

class UserInput {
    Scanner scanner = new Scanner(System.in);

    // Method to get input for two integers from the user
    int[] getTwoIntegers() {
        int[] numbers = new int[2];
        System.out.println("Enter the first integer: ");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter the second integer: ");
        numbers[1] = scanner.nextInt();
        return numbers;
    }

    // Method to get input for a single integer from the user
    int getSingleInteger() {
        System.out.println("Enter an integer: ");
        return scanner.nextInt();
    }

    // Method to get input for an array of integers from the user
    int[] getIntegerArray() {
        System.out.println("Enter the number of elements in the array: ");
        int arraySize = scanner.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter " + arraySize + " integers:");
        for (int i = 0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
