import java.sql.Array;
import java.util.Scanner;

public class squashAndMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int j = 0; j < n - 1; j++) {
            int first = numbers[j] % 10;
            int second = numbers[j + 1] / 10;
            System.out.print(first * 10 + second);
            if (j != n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

            for ( int j = 0; j < n - 1; j++) {
                int first = numbers[j] / 10;
                int mid = (numbers[j] % 10 + numbers[j + 1] / 10) % 10;
                int last = numbers[j + 1] % 10;
                System.out.print(first * 100 + mid * 10 + last);
                if (j != n - 1) {
                    System.out.print(" ");
                }


            }
        System.out.println();



        }
    }

