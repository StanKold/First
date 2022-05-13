import java.util.Scanner;

public class CesarCiper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char []input = scanner.nextLine().toCharArray();
        String encripted = "";

        for(char c: input){
            encripted += (char)(c+3);
        }

        System.out.println(encripted);


    }
}
