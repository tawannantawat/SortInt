import java.util.Arrays;
import java.util.Scanner;

public class SortInt {
    static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name+"!");
    }
    static void sortMethod(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of integers (n):");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a nonnegative integer.");
            return;
        }

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers (one per line):");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers); // Sorting the array of integers

        System.out.println("Sorted integers (in ascending order):");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    public static void main(String[] args) {
        greeting();
        sortMethod();

    }
}