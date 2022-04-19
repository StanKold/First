import java.util.Scanner;

public class computerParts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        int discount = 0;
        if (video > cpu) {
            discount = discount+15;
        }
//•	Видеокарта – 250 лв./бр.
//•	Процесор – 35% от цената на закупените видеокарти/бр.
//•	Рам памет – 10% от цената на закупените видеокарти/бр.
        double sum = (video*250 +cpu*(video*250)*0.35 +ram*(video*250)*0.1)*(100-discount)/100;
        //"You have {остатъчен бюджет} leva left!"
        //•	Ако сумата надхвърля бюджета:
        //"Not enough money! You need {нужна сума} leva more!"
        //Резултатът да се форматира до втория знак след десетичната запетая.
        if (sum <= money) {
            System.out.printf("You have %.2f leva left!", (money -sum));
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", (sum-money));
        }











    }
}
