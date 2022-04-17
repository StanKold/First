import java.util.Scanner;

public class movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
     int statists = Integer.parseInt(scanner.nextLine());
        double clods = Double.parseDouble(scanner.nextLine());
        int discount = 0;
        if (statists >150){
            discount = discount +10;
        }
        double calc = money*0.1 +(statists *clods)*(100-discount)/100;
        if (money >= calc){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", (money-calc));
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", (calc - money));

        }
    }
}
