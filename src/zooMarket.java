import java.util.Scanner;

public class zooMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int cats = Integer.parseInt(scanner.nextLine());
        System.out.println(dogs * 2.5 + cats * 4 +" lv");
    }
}
