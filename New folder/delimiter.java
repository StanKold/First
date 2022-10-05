import java.util.Scanner;

public class delimiter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String family = scanner.nextLine();
        String mid = scanner.nextLine();

        System.out.println(mid+" "+family+" "+first);
    }
}
