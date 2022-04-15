import java.util.Scanner;

public class toyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Пъзел - 2.60 лв.
        // Говореща кукла - 3 лв.
        // Плюшено мече - 4.10 лв.
        // Миньон - 8.20 лв.
        // Камионче - 2 лв.
        double vacation = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());
        int discount = 0;
        if (puzzle+doll+bear+minion+truck >= 50) {
            discount = discount +25;
        }
        double net = (puzzle*2.60+doll*3+bear*4.10+minion*8.2+truck*2)*0.9*(100-discount)/100;
        if (net >= vacation ){
            System.out.printf("Yes! %.2f lv left.", (net-vacation));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",(vacation-net));
        }


    }
}
