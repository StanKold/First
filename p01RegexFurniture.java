import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p01RegexFurniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String regex = "[>]{2}(?<product>[\\w]+)[<]{2}(?<price>[\\d.]+)!(?<quantity>[\\d]+)";
        Pattern pattern = Pattern.compile(regex);
double sum = 0;
        System.out.println("Bought furniture:");
        while (!line.equals("Purchase")) {
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {

                System.out.println(matcher.group("product"));
sum +=  Double.parseDouble(matcher.group("price")) * Integer.parseInt(matcher.group("quantity"));
            }


            line = scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f",sum);
    }
}
