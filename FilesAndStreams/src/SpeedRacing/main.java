package SpeedRacing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Car>cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            cars.add(new Car (input[0],Double.parseDouble(input[1]),Double.parseDouble(input[2]),0.00));
        }
        String input = scanner.nextLine();
        while(!input.equals("End")){
            String [] commands = input.split("\\s+");
            //format "Drive {CarModel} {amountOfKm}",
String model =







            input = scanner.nextLine();
        }




    }
}
