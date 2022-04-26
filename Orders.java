import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String[]input = scanner.nextLine().split(" ");



        String name = input[0];
        Map<String, List<Double>> order= new LinkedHashMap<>();
        while(!name.equals("buy")){
            double price = Double.parseDouble(input[1]);
            double quantity = Double.parseDouble(input[2]);
            if(order.containsKey(name)) {
                 order.get(name).set(0, price);
                order.get(name).set(1, order.get(name).get(1) + quantity);
            }else {
                order.put(name, new ArrayList<>());
                 order.get(name).add(price);
                order.get(name).add(quantity);
            }
            input = scanner.nextLine().split(" ");
            name= input[0];
        }
        for(Map.Entry<String ,List<Double>> e : order.entrySet()){
            System.out.printf("%s -> %.2f%n" ,e.getKey(),e.getValue().get(0)*e.getValue().get(1));


        }








    }
}
