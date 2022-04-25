import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class parkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parked = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            switch (input[0]) {
                case "register":
                    if (parked.containsKey(input[1])) {
                        System.out.println("ERROR: already registered with plate number " + parked.get(input[1]));
                    } else {
                        parked.put(input[1], input[2]);
                        System.out.println(input[1] + " registered " + input[2] + " successfully");
                    }
                    break;
                case "unregister":
                    if (parked.containsKey(input[1])) {
                        System.out.println(input[1] + " unregistered successfully");
                        parked.remove(input[1]);
                    } else {
                        System.out.println("ERROR: user " + input[1] + " not found");
                    }
                    break;

            }


        }

        for(Map.Entry<String,String> e: parked.entrySet()){
            System.out.println(e.getKey()+" => "+e.getValue());
        }
    }
}
