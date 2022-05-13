import java.util.Scanner;

public class SplitLettersnandNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
String digits = "";
String letters = "";
String symbols = "";
        for(int i =0; i<input.length();i++){
            Character tested= input.charAt(i);
            if( tested > 47 && tested < 58){
                digits += tested;
            } else if ((tested > 64 && tested < 91) || (tested > 96 && tested < 123)) {
            letters += tested;

            }else{
                symbols += tested;
            }
            }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(symbols);


        }
    }

