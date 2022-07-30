import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] player = scanner.nextLine().split(" ");
        int n = scanner.nextInt();
        ArrayDeque<String> players = new ArrayDeque<>();
        for (String s : player) {
            players.offer(s);
        }
        int counter = 1;
        while (players.size() > 1) {
            if (counter < n) {
                players.offer(players.poll());
                counter++;
            } else {
                System.out.println("Removed "+players.poll());
                counter=1;
            }
        }
        System.out.println("Last is "+players.poll());

    }
}
