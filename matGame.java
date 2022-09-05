import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class matGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int last = n%10;
        n/=10;
        int middle = n%10;
        int first = n/10;
        ArrayList <Integer> digits = new ArrayList<>();
        digits.add(last+middle+first);
        digits.add(last*middle+first);
        digits.add(last+middle*first);
        digits.add(last*first+middle);
        digits.add(last*middle*first);

        Integer max = Collections.max(digits);

        System.out.println(max);



    }
}
