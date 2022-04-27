import java.util.Scanner;

public class Exam04CriptMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        String comand = scanner.nextLine();
        while (!comand.equals("Reveal")) {
                       String regex = "(:\\|:)";
            String[] comands = comand.split(regex);
            switch (comands[0]) {
                case "InsertSpace":
                    int index = Integer.parseInt(comands[1]);
                    sb.insert(index, " ");
                    System.out.println(sb.toString());
                    break;
                case "Reverse":
                    String rev = comands[1];
                    int count = rev.length();
                    int start = sb.indexOf(rev);
                    if (start == -1) {
                        System.out.println("error");
                    } else {
                        for (int i = count-1; i >= 0; i--) {
                            sb.append(sb.charAt(start+i));
                            sb.deleteCharAt(start+i);
                        }
                        System.out.println(sb.toString());
                    }
                    break;
                case "ChangeAll":
                    String change = comands[1];
                    String replacement = comands[2];
                    while(sb.indexOf(change) != -1){
                        int z= sb.indexOf(change);
                        sb.deleteCharAt(z);
                        sb.insert(z, replacement);

                    }
                    System.out.println(sb.toString());
                    break;


            }

comand = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s",sb.toString());

    }
}
