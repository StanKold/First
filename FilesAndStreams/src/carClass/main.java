package carClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String [] command = scanner.nextLine().split("\\s+");
            if (command.length ==3){
            Car c = new Car(command[0], command[1], Integer.parseInt(command[2]));
                cars.add(c);
            }else {
            Car c = new Car(command[0], "unknown", -1);
                cars.add(c);
            }

         }
        for (Car each: cars){
            System.out.println(each.carInfo());
        }
 }


}
