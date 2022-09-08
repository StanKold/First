import java.util.Arrays;
import java.util.Scanner;

public class aloneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] line = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i < line.length - 1; i++) {
            if (line[i] == n && line[i - 1] != n && line[i + 1] != n) {
                if (line[i - 1] > line[i + 1]) {
                    line[i] = line[i - 1];
                } else {
                    line[i] = line[i + 1];

                }


            }
        }
        System.out.println(Arrays.toString(line));

    }
}
