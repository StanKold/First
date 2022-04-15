import java.util.Scanner;

public class secToMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int seconds = a+b+c;
        int min = seconds/60;
        int secs = seconds%60;
                if (secs < 10 ) {
                    System.out.println(min+":0"+secs);
                } else {
                    System.out.println(min+":"+secs);
                }
    }
}
