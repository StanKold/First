import java.util.Scanner;

public class FinalExam01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String comand = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        while (!comand.equals("Done")) {
            String[] comands = comand.split(" ");

            switch (comands[0]) {
                case "Change":
                    String toReplace = comands[1];
                    String replacement = comands[2];
                    int n = replacement.length();
                    while (sb.indexOf(toReplace) != -1) {
                        sb.replace(sb.indexOf(toReplace), sb.indexOf(toReplace)+1, replacement);
                    }
                    System.out.println(sb.toString());
                    break;
                case "Includes":
                    String sub = comands[1];
                    if (sb.indexOf(sub) != -1) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;

                case "End":
                    sub = comands[1];
                    n = sub.length();
                    if (sb.lastIndexOf(sub) + n == sb.length()) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;


                case "Uppercase":
                    String actualSB = sb.toString().toUpperCase();
                    sb.setLength(0);
                    sb.append(actualSB);
                    System.out.println(sb.toString());
                    break;

                case "FindIndex":
                    String find = comands[1];
                    System.out.println(sb.indexOf(find));
                    break;

                case "Cut":
                    int start = Integer.parseInt(comands[1]);
                    n = Integer.parseInt(comands[2]);
                    sub = sb.substring(start, start + n);
                    sb.setLength(0);
                    sb.append(sub);
                    System.out.println(sb.toString());
                    break;
            }

            comand = scanner.nextLine();
        }


    }
}
