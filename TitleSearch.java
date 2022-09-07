import java.util.Scanner;

public class TitleSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalLine = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        boolean contains = true;

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("");
            String line = originalLine;
            int start = 0;
            int count=0;
            for (int j = 0; j < input.length; j++) {
                contains = line.substring(count, line.length()).contains(input[j]);
                if (!contains) {
                    System.out.println("No such title found!");
                    break;
                } else {
                    start = line.substring(count, line.length()).indexOf(input[j])+count  ;
                    line = line.substring(0, start) + line.substring(start + 1);
                    count = start;


                }


            }
            if (contains) {
                System.out.println(line);
                originalLine = line;
                count=0;

            }


        }

    }
}
