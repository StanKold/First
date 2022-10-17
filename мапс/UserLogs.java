import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> users = new TreeMap<>();
        String input = scanner.nextLine();
        while(!input.equals("end")){
            String [] line = input.split(" ");
            String[]ip=line[0].split("=");
            String[]user =line[2].split("=");

            users.putIfAbsent(user[1], new LinkedHashMap<>());
            users.get(user[1]).putIfAbsent(ip[1], 0);
            users.get(user[1]).put(ip[1],users.get(user[1]).get(ip[1])+1);

            input= scanner.nextLine();
        }


        for (Map.Entry<String, Map<String, Integer>> entry: users.entrySet()) {
            System.out.println(entry.getKey()+": ");
            int i = 1;
            for (Map.Entry<String,Integer> mesage: entry.getValue().entrySet()) {
                System.out.printf("%s => %d",mesage.getKey(),mesage.getValue());

                if(i < entry.getValue().size()) {
                    System.out.print(", ");
                }else{
                    System.out.printf(". %n");
                }
                i++;
                }
            }


        }



    }

