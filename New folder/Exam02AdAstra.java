import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exam02AdAstra {
    public static class Enters{
        String name;
        String good;
        String calls;

        public String getName() {
            return name;
        }

        public String getGood() {
            return good;
        }

        public String getCalls() {
            return calls;
        }

        Enters (String name, String good, String calls){
            this.name = name;
            this.good= good;
            this.calls=calls;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
List<Enters> enters = new ArrayList<>(); 
        String regex = "([#]|[|])(?<product>[A-Z][a-z]+( [A-Z][a-z]+)*)(\\1)(?<date>\\d+\\/\\d+\\/\\d+)(\\1)(?<call>\\d+)(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        int callory = 0;
        while (matcher.find()) {
            
            callory += Integer.parseInt(matcher.group("call"));
            enters.add(new Enters(matcher.group("product"),matcher.group("date"),matcher.group("call")));
        }
        int last = callory/2000;
        System.out.printf("You have food to last you for: %d days!\n" ,last);
        for (int i = 0; i < enters.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s\n",enters.get(i).getName(),enters.get(i).getGood(),enters.get(i).getCalls());
        }
    }
}
