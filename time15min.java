import java.util.Scanner;

public class time15min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int h= Integer.parseInt (scanner.nextLine());
         int m= Integer.parseInt (scanner.nextLine());
         int time = h*60 + m +15;
         int hours = time /60;
         int minutes = time%60;
         if (hours == 24 ){
             hours =hours - 24;
         }else if (hours > 24 ){
             hours = hours-24;         }
         if (minutes <10) {
             System.out.println(hours+":0"+minutes);
         }else {
             System.out.println(hours+":"+minutes);
         }
    }

}
