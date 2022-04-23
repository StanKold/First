import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FinalExam03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        //o	"Blocked: {username}"
        Map<String, Integer> flowers = new LinkedHashMap<>();
        while (!input.equals("Log out")) {
            String[] comands = input.split(": ");

            switch (comands[0]) {
                case "New follower":
                    String user = comands[1];
                    flowers.putIfAbsent(user, 0);
                    break;
                case "Like":
                    user = comands[1];
                    int n = Integer.parseInt(comands[2]);
                    flowers.putIfAbsent(user, 0);
                    flowers.put(user, flowers.get(user) + n);
                    break;
                case "Comment":
                    user = comands[1];
                    flowers.putIfAbsent(user, 0);
                    flowers.put(user, flowers.get(user) + 1);
                    break;
                case"Blocked":
                    user =comands[1];
                   if( flowers.containsKey(user)){
                    flowers.remove(user);
                   }else {
                       System.out.println(user+" doesn't exist.");
                   }
            }

            input = scanner.nextLine();
        }
        System.out.println(flowers.size()+" followers");
        for(Map.Entry<String ,Integer> f: flowers.entrySet()){
            System.out.println(f.getKey()+": "+f.getValue());
        }

    }
}
