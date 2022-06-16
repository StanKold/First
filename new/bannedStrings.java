import java.util.Scanner;

public class bannedStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] banned = scanner.nextLine().split(", ");
String input = scanner.nextLine();
int replaces=0;
String replace ="";
for(int i =0; i< banned.length ; i++){
    replace ="*";
    replaces = banned[i].length();
    replace= replace.repeat(replaces);
    input = input.replaceAll(banned[i], replace);
}
        System.out.println(input);
    }
}
