import java.util.Scanner;

public class gameTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        double money = sum;
        String input = scanner.nextLine();
        while (!input.equals("Game Time")) {
            switch (input) {

                case "OutFall 4":
                    if (sum >= 39.99) {
                        System.out.println("Bought OutFall 4");
                        sum -= 39.99;

                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "CS: OG":
                    if (sum >= 15.99) {
                        System.out.println("Bought CS: OG");
                        sum -= 15.99;

                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "Zplinter Zell":
                    if (sum >= 19.99) {
                        System.out.println("Bought Zplinter Zell");
                        sum -= 19.99;

                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (sum >= 59.99) {
                        System.out.println("Bought Honored 2");
                        sum -= 59.99;

                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch":
                    if (sum >= 29.99) {
                        System.out.println("Bought RoverWatch");
                        sum -= 29.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "RoverWatch Origins Edition":
                    if (sum >= 39.99) {
                        System.out.println("Bought RoverWatch Origins Edition");
                        sum -= 39.99;
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

            input = scanner.nextLine();
            if (sum == 0) {
                System.out.println("Out of money!");
                input = "Game Time";
            }


        }
        if (sum > 0) {
            money -= sum;
            System.out.printf("Total spent: $%.02f. Remaining: $%.02f", money, sum);
        }


    }
}

