import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02RegexRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] racers = scanner.nextLine().split(", ");
        Map<String, Integer> race = new LinkedHashMap<>();
        for (int i = 0; i < racers.length; i++) {
            race.put(racers[i], 0);
        }
        String regexL = "[A-Za-z]+";
        String regexD = "[1-9]";

        Pattern paternL = Pattern.compile(regexL);

        Pattern paternD = Pattern.compile(regexD);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            int kms = 0;
            StringBuilder sb = new StringBuilder();

            Matcher matcherL = paternL.matcher(input);
            Matcher matcherD = paternD.matcher(input);
            while (matcherL.find()) {
                sb.append(matcherL.group());
            }
            if (race.containsKey(sb.toString())) {
                while (matcherD.find()) {
                    kms += Integer.parseInt(matcherD.group());
                }
                race.put(sb.toString(), race.get(sb.toString()) + kms);
            }


            input = scanner.nextLine();

        }
        Map<Integer, String> winner = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Integer> r : race.entrySet()) {
            winner.put(r.getValue(), r.getKey());
        }
        int counter = 1;
        String text = "";
        for (Map.Entry<Integer, String> w : winner.entrySet()) {
            if (counter == 1) {
                text = "1st";
            } else if (counter == 2) {
                text = "2nd";
            } else {
                text = "3rd";
            }
            System.out.println(text + " place: " + w.getValue());
            counter++;
            if (counter == 4) {
                break;
            }
        }


    }
}
