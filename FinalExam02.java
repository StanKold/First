import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalExam02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String regex = "!(?<comand>[A-Z][a-z+]{2,})!:\\[(?<translate>[A-Za-z]{8,})\\]";
        for(int i =0; i<n;i++){
            String input = scanner.nextLine();

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if(!matcher.find()){
                System.out.println("The message is invalid");
            }else{
String comand = matcher.group("comand");
String translate = matcher.group("translate");
                System.out.print(comand+": ");
                for(int k=0; k<translate.length();k++){
                    int translated = translate.charAt(k);
                    System.out.print(translated);
                    if(k<translate.length()-1){
                        System.out.print(" ");
                    }
                }

                System.out.println("");
            }
        }

    }
}
