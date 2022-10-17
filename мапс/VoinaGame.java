import java.util.*;

public class VoinaGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] playerOne = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] playerTwo = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Set<Integer> one = new LinkedHashSet<>();
        for (int i : playerOne) {
            one.add(i);
        }
        Set<Integer> two = new LinkedHashSet<>();
        for (int i : playerTwo) {
            two.add(i);
        }

        for (int i = 0; i < 50; i++) {
            int cardOne = one.iterator().next();
            one.remove(cardOne);

            int cardTwo = two.iterator().next();
            two.remove(cardTwo);

            if (cardOne > cardTwo) {
                one.add(cardOne);
                one.add(cardTwo);
            }else if(cardTwo>cardOne)  {
                two.add(cardOne);
                two.add(cardTwo);
            }

            if (one.isEmpty()) {
                System.out.println("Second player win!");
                break;
            }else if (two.isEmpty()) {
                System.out.println("First player win!");
                break;
            }


        }

if(!one.isEmpty() && !two.isEmpty()) {
    if (one.size() > two.size()) {
        System.out.println("First player win!");
    } else if (two.size() > one.size()) {
        System.out.println("Second player win!");
    } else {
        System.out.println("DRAW !");
    }
}

    }
}
