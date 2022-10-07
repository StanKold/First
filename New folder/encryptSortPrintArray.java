import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class encryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int[] names = new int[lines];
        for (int i = 0; i < lines; i++) {
            String name = scanner.nextLine();
            int sum = 0;

            for (int k = 0; k < name.length(); k++) {
                int num = name.charAt(k);
                if (num == 97 || num == 101 || num == 105 || num == 111 || num == 117 ) {
                    sum += num * name.length();
                } else if (num == 65 || num == 69 || num == 73 || num == 79 || num == 85 ) {
                    sum += num * name.length();
                } else if (num > 65 && num <=90){
                    sum += num / name.length();
                }   else if (num > 97 && num <= 122){
                    sum += num / name.length();

                }
            }
            names[i] = sum;
        }
        Arrays.sort( names);

        for (int e : names) {
            System.out.println(e);

        }
    }
}
