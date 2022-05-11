import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VallidPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split(", "))
                .filter(username -> username.matches("[0-9a-zA-Z-_]{3,16}+"))
                .forEach(System.out::println);

        }


        }


