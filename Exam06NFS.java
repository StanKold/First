import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam06NFS {
    public static class Range {
        int milage;
        int fuel;

        public Range(int milage, int fuel) {
            this.milage = milage;
            this.fuel = fuel;
        }

        public int getMilage() {
            return milage;
        }

        public void setMilage(int milage) {
            this.milage = milage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Range> game = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("[|]");
            game.put(input[0], new Range(Integer.parseInt(input[1]),Integer.parseInt(input[2])));
        }
    String comand = scanner.nextLine();
        while(!comand.equals("Stop")){


            String[]comands = comand.split(" : ");
            switch(comands[0]){
                case "Drive":
                    String car = comands[1];
                    int kms = Integer.parseInt(comands[2]);
                    int fuel = Integer.parseInt(comands[3]);
                    if(game.containsKey(car)){
                       if( game.get(car).getFuel()>= fuel){
                           game.get(car).setMilage(game.get(car).getMilage()+kms);
                           game.get(car).setFuel(game.get(car).getFuel()-fuel);
                           System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n",car,kms,fuel);
                           if(game.get(car).getMilage()>100000){
                               game.remove(car);
                               System.out.printf("Time to sell the %s!\n",car);
                           }
                       }else{
                           System.out.println("Not enough fuel to make that ride");
                       }
                    }
                    break;
                case "Refuel":
                     car = comands[1];
                     int fuelInTank=game.get(car).getFuel();
                   fuel = Integer.parseInt(comands[2]);
                    if(fuelInTank+fuel>75){
                        fuel=75-fuelInTank;
                    }
                    game.get(car).setFuel(game.get(car).getFuel()+fuel);
                    System.out.printf("%s refueled with %d liters\n",car,fuel);
                    break;

                case"Revert":
                    car = comands[1];
                    kms = Integer.parseInt(comands[2]);
                    int actualMilage = game.get(car).getMilage();
                    if(actualMilage-kms<10000){
                        kms=actualMilage-10000;
                    }
                    game.get(car).setMilage(game.get(car).getMilage()-kms);
                    System.out.printf("%s mileage decreased by %d kilometers\n",car,kms );

                    break;
            }

   comand= scanner.nextLine();
        }
for(Map.Entry<String,Range> g : game.entrySet()){
    System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",g.getKey(),g.getValue().getMilage(),g.getValue().getFuel());

}






    }
}
