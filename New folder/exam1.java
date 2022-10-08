import java.util.Scanner;

public class exam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int comision = Integer.parseInt(scanner.nextLine());
        double profit =  days*tickets*price*(1-comision/100.0);
        System.out.printf("The profit from the movie %s is %.2f lv.",movie,profit);

    }
}
