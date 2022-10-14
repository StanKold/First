import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phones = new HashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String[] comand = input.split("-");
            phones.put(comand[0], comand[1]);
            input= scanner.nextLine();
     }
        input= scanner.nextLine();
        while (!input.equals("stop")) {
            if(phones.containsKey(input)){
                System.out.println(input+" -> "+phones.get(input));
            }else{
                System.out.printf("Contact %s does not exist.%n",input);
            }
            input= scanner.nextLine();
        }

    }
}
