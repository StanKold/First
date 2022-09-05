import java.util.Scanner;

public class primeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i<= 2 || !notPrime(i)) {
                for (int j = 1; j <= i; j++) {
                    if (j == 1) {
                        System.out.print("1");
                    } else if (j == 2) {
                        System.out.print("1");
                    } else if (notPrime(j)) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
                System.out.println();
            }

        }

    }

    public static boolean notPrime(Integer z) {
        boolean notPrime = false;
        for (int k = 2; k < z; k++) {
            if (z % k == 0) {
                notPrime = true;
                break;
            }
        }
        return notPrime;
    }

}




