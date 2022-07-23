import java.util.*;
import java.util.stream.Collectors;

public class simpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actual ="";
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> commands = new ArrayDeque<>();
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] command = input.split(" ");
            switch (command[0]) {
                case "1":
                    commands.push(actual);
                    String toadd = command[1];
                    for (int j = 0; j < toadd.length(); j++) {
                        line.append(toadd.charAt(j));
                    }
actual= line.toString();

                    break;
                case "2":
                    commands.push(actual);
                    int toDelete = Integer.parseInt(command[1]);
                    for (int j = toDelete; j > 0; j--) {
                        line.deleteCharAt(line.length() - 1);
                    }
                    actual= line.toString();
                    break;
                case "3":
                    System.out.println(line.charAt(Integer.parseInt(command[1]) - 1));
                    break;
                case "4":

                    if(!commands.isEmpty()) {
                        line = new StringBuilder();
                         String returned = commands.pop();
                        for (int j = 0; j < returned.length(); j++) {
                            line.append(returned.charAt(j));
                        }
                    }
                    break;


            }


        }


    }


}
