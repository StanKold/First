import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Character, Integer> characters = new TreeMap<>();
        for (int i = 0; i < line.length(); i++) {
            characters.putIfAbsent(line.charAt(i),0);
            characters.put(line.charAt(i),characters.get(line.charAt(i))+1);
        }
        for (Map.Entry<Character, Integer> e: characters.entrySet()) {
            System.out.printf("%c: %d time/s%n",e.getKey(),e.getValue());
        }

    }
}
