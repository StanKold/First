import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class anagramWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> word = (ArrayList<String>) Arrays.stream(scanner.nextLine().split(""))
                .collect(Collectors.toList());
        Collections.sort(word);

int n = Integer.parseInt(scanner.nextLine());
ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ArrayList<String> input = (ArrayList<String>) Arrays.stream(scanner.nextLine().split(""))
                    .collect(Collectors.toList());
            Collections.sort(input);
            list.add(input.toString());
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word.toString())){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }

        }



        }


}
