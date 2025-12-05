import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. รับค่า Input (Integers)
        System.out.print("Enter integers: "); // ex. 3 2 1 5 4
        String inputLine = scanner.nextLine();
        String[] strArray = inputLine.split(" ");
        int[] numbers = new int[strArray.length];
        
        for (int i = 0; i < strArray.length; i++) {
            numbers[i] = Integer.parseInt(strArray[i]);
        }

        // 2. เลือก Algorithm
        System.out.println("Choose Algorithm:");
        System.out.println("1. Quick Sort");
        System.out.println("2. Bubble Sort");
        System.out.print("Enter choice (1 or 2): ");
        int choice = scanner.nextInt();

        // 3. เรียกใช้งาน Class Sort ตามที่เลือก
        if (choice == 1) {
            QuickSort qs = new QuickSort();
            qs.sort(numbers, 0, numbers.length - 1);
        } else if (choice == 2) {
            BubbleSort bs = new BubbleSort();
            bs.sort(numbers);
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        // 4. แสดงผลลัพธ์
        System.out.println("Result: " + Arrays.toString(numbers));
    }
}