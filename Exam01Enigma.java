import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exam01Enigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String coded = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
sb.append(coded);

        String input = scanner.nextLine();



        while (!input.equals("Decode")) {
            String[] command = input.split("[|]");
            switch (command[0]) {
                case "ChangeAll":
                    char replace = command[1].charAt(0);
                    String replacement = command[2];
                    for (int i = 0; i < sb.length(); i++) {
                        if (sb.charAt(i) == replace) {
                            sb.deleteCharAt(i);
                            sb.replace(i,i, replacement);
                        }
                    }
                    break;
                case "Insert":
                    int n = Integer.parseInt(command[1]);
                    replacement = command[2];
                    sb.insert(n, replacement);

                    break;
                case "Move":
                    n = Integer.parseInt(command[1]);
                    for (int k = 0; k < n; k++) {
                        sb.append(sb.charAt(0));
                        sb.deleteCharAt(0);
                    }
                    break;

            }
            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: "+sb.toString());


    }
}
