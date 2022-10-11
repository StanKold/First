import java.util.ArrayDeque;
import java.util.Scanner;

public class ReversNumbersStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");
        ArrayDeque<String> order = new ArrayDeque<>();
        for (String s : input) {
            order.push(s);
        }

        for (String o : order) {
            System.out.print(o+" ");

        }

    }
}
