import java.util.Scanner;

public class excellent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt (scanner.nextLine());
        if (grade >= 5.0) {
            System.out.println("Excellent!");
        }
    }
}
