import java.util.*;

public class forceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> usersList = new LinkedHashMap<>();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains("|")) {
                String[] comand = input.split(" [[ | ]] ");
                if(!usersList.containsKey(comand[1])){
                usersList.put(comand[1], comand[0]);}
            } else if (input.contains("->")) {
                String[] comand = input.split(" -> ");
                usersList.remove(comand[0]);
                usersList.put(comand[0], comand[1]);
                System.out.println(comand[0] + " joins the " + comand[1] + " side!");

            }
                input = scanner.nextLine();
            }
            Map<String, List<String>> side = new LinkedHashMap<>();
            for (Map.Entry<String, String> entry : usersList.entrySet()) {
                side.putIfAbsent(entry.getValue(), new ArrayList<>());
                side.get(entry.getValue()).add(entry.getKey());
            }


            for (Map.Entry<String, List<String>> e : side.entrySet()) {
                System.out.println("Side: " + e.getKey() + ", Members: " + e.getValue().size());
                for (int i = 0; i < e.getValue().size(); i++) {
                    System.out.println("! " + e.getValue().get(i));
                }
            }


        }
    }

