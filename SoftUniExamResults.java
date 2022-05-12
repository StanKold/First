import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> studentNames = new LinkedHashMap<>();
        Map<String, Integer> programLanguage = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] comand = input.split("-");
            String name = comand[0];
            String language = comand[1];
            if (comand[1].equals("banned")) {
                studentNames.remove(name);
                input= scanner.nextLine();
                continue;
            }
            int score = Integer.parseInt(comand[2]);
            studentNames.putIfAbsent(name, 0);
            if (studentNames.get(name) < score) {
                studentNames.put(name, score);

            }
            programLanguage.putIfAbsent(language, 0);
            programLanguage.put(language, programLanguage.get(language) + 1);

            input = scanner.nextLine();
        }

        System.out.println("Results:");
        for (Map.Entry<String, Integer> e : studentNames.entrySet()) {
            System.out.println(e.getKey() + " | " + e.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> z : programLanguage.entrySet()) {
            System.out.println(z.getKey() + " - " + z.getValue());
        }
    }
}