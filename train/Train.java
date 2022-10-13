import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            List<String> comands = Arrays.stream(input.split(" "))
                    .map(String::toString).collect(Collectors.toList());
            if (comands.get(0).equals("Add")) {
                wagons.add(Integer.parseInt(comands.get(1)));
            } else {
                int passengers = Integer.parseInt(comands.get(0));
                for (int i = 0; i < wagons.size(); i++) {
                    if (wagons.get(i) + passengers <= n) {
                        wagons.set(i, wagons.get(i) + passengers);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for(Integer e: wagons){
            System.out.print(e+ " ");
        }
    }
}


