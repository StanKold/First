import java.util.ArrayDeque;
import java.util.Scanner;

public class PotatoMat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] player = scanner.nextLine().split(" ");
        int n = scanner.nextInt();
        ArrayDeque<String> players = new ArrayDeque<>();
        for (String s : player) {
            players.offer(s);
        }
        int composit = 0;
        int counter = 1;
        while (players.size() > 1) {
            composit++;

            if (counter < n) {
                players.offer(players.poll());
                counter++;

            } else {
                int cicle = composit/n;
                if (counter ==n && simpleNumbers(cicle)) {
                    String actual = players.peek();
                    System.out.println("Prime " + actual);
                   counter = 1;
                } else {

                    System.out.println("Removed " + players.poll());
                    counter = 1;

                }
                }
            }

        System.out.println("Last is " + players.poll());

    }

    private static boolean simpleNumbers(int circle) {
        boolean is = true;
        if(circle ==1){
            is= false;
        }else if (circle >=2 && circle <=3 ){
            is= true;
        }else if(circle>3){
            for (int i = 2; i < circle; i++) {
                if (circle % i == 0) {
                    is= false;
                }}
        }else{
            is= true;
        }
return is;
    }
}
