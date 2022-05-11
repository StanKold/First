import java.util.*;
import java.util.stream.Collectors;

public class WordSynonyms {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> synonims = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String kay = scanner.nextLine();
            String value = scanner.nextLine();
            List<String> values = synonims.get(kay);
            if (synonims.containsKey(kay)) {
                values.add(value);
            } else {
                values = new ArrayList<>();
                values.add(value);
                synonims.put(kay, values);
            }

        }
        for (Map.Entry<String, List<String>> entry : synonims.entrySet()) {

            System.out.print(entry.getKey() + " - "+entry.getValue().stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(", ")));
            System.out.println();
        }
              }
    }
