package Project;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Integers :"); //ex: 34 2 10 6
        String input = scanner.nextLine();
        String[] stringNumbers = input.trim().split("\\s+");
        int[] numbers = new int[stringNumbers.length];

        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        System.out.println("Choose Algorithm");
        System.out.println("1. Quick Sort");
        System.out.println("2. Bubble Sort");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        if(choice ==1){
            QuickSort.quickSort(numbers,0, numbers.length -1);
        } else if (choice == 2) {
            BubbleSort bubbleSort = new BubbleSort();
            bubbleSort.sort(numbers);
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }
        System.out.println("Result: " + Arrays.toString(numbers));
        scanner.close();
    }
}