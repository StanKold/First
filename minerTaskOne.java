import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class minerTaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> elements = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            int element = Integer.parseInt(scanner.nextLine());
            elements.putIfAbsent(input, 0);
            elements.put(input, elements.get(input) + element);
            input= scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : elements.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


    }
}
