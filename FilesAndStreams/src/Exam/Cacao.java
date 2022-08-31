package Exam;

import java.util.*;

public class Cacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<Double>milk = new ArrayDeque<>();
        for (String i : input) {
            milk.offer(Double.parseDouble(i));
        }
        input = scanner.nextLine().split("\\s+");
        ArrayDeque<Double> coco = new ArrayDeque<>();
        for (String i : input) {
            coco.push(Double.parseDouble(i));
        }


        Map<String, Integer> production = new TreeMap<>();


        while(!milk.isEmpty() && !coco.isEmpty()) {
            double actualMilk = milk.poll();
            double actualCoco = coco.pop();
            double percentage = actualCoco*100 / (actualCoco + actualMilk);
            String product;
            switch ((int) percentage) {
                case 30:
                    product = "Milk Chocolate";
                    production.putIfAbsent(product, 0);
                    production.put(product, production.get(product) + 1);
                    break;
                case 50:
                    product = "Dark Chocolate";
                    production.putIfAbsent(product, 0);
                    production.put(product, production.get(product) + 1);
                    break;
                case 100:
                    product = "Baking Chocolate";
                    production.putIfAbsent(product, 0);
                    production.put(product, production.get(product) + 1);
                    break;
                default:
                    milk.offer(actualMilk + 10);
                    break;
            }
        }
            if(production.size()==3){
                System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
            }else {
                System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
            }
            for(Map.Entry<String, Integer> entry : production.entrySet()){
                System.out.println("# "+entry.getKey()+" --> "+entry.getValue());

            }










    }







}
