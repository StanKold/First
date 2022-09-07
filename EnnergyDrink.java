import java.util.Scanner;

public class EnnergyDrink {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Long.parseLong(scanner.nextLine());
        int odd = 0;
        int even = 0;
        if (n == 0) {
            System.out.println(0 + " energy drinks");
        } else {
            while (n > 0) {
                if ((n % 10) % 2 != 0) {
                    odd += n % 10;
                } else {
                    even += n % 10;
                }
                n /= 10;
            }
            if (odd > even) {
                System.out.println(odd + " cups of coffee");
            } else if (even > odd) {

                System.out.println(even + " energy drinks");
            } else {
                System.out.println(even + " of both");
            }


        }
    }
}
