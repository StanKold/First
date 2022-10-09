import java.util.Scanner;

public class hundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Да се напише програма, която чете цяло число, въведено от потребителя и проверява дали е под 100, между
        //100 и 200 или над 200. Ако числото е:
        // под 100 отпечатайте: &quot;Less than 100&quot;
        // между 100 и 200 отпечатайте: &quot;Between 100 and 200&quot;
        // над 200 отпечатайте: &quot;Greater than 200&quot;
        int num = Integer.parseInt(scanner.nextLine());
        if ( num <100 ) {
            System.out.println("Less than 100");
        } else if (num<=200) {
            System.out.println("Between 100 and 200");
        }else {
            System.out.println("Greater than 200");
        }
    }
}
