import java.util.Scanner;

public class speed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double spd = Double.parseDouble(scanner.nextLine());
        //При скорост до 10 (включително) отпечатайте &quot;slow&quot;
        // При скорост над 10 и до 50 (включително) отпечатайте &quot;average&quot;
        // При скорост над 50 и до 150 (включително) отпечатайте &quot;fast&quot;
        // При скорост над 150 и до 1000 (включително) отпечатайте &quot;ultra fast&quot;
        // При по-висока скорост отпечатайте &quot;extremely fast&quot;
        if (spd <= 10 ) {
            System.out.println("slow");
        } else if (spd <=50){
            System.out.println("average");
        } else if (spd <=150){
            System.out.println("fast");
        } else if (spd <=1000){
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
