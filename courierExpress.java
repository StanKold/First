import java.util.Scanner;

public class courierExpress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        int milage = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double cost = 0;

        if (weight < 1.00){
            price=0.03;
        }else if (weight <10.00){
            price=0.05;
        }else if (weight <40.00){
            price=0.10;
        }else if (weight <90.00){
            price=0.15;
        }else if (weight <150.00){
            price=0.20;
        }



        switch (type){
            case"standard":
                cost= milage*price;
                break;

            case "express":
                  if (weight < 1.00){
                    cost= (milage*price) + milage*weight*price*0.8;
                }else if (weight <10.00){
                      cost= (milage*price) + milage*weight*price*0.4;
                }else if (weight <40.00){
                      cost= (milage*price) + milage*weight*price*0.05;
                }else if (weight <90.00){
                      cost= (milage*price) + milage*weight*price*0.02;
                }else if (weight <150.00){
                      cost= (milage*price) + milage*weight*price*0.01;

                }
                break;
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",weight,cost);

    }
}
