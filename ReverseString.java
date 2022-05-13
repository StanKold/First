import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("end")){
            String reversed = "";
            for(int i = input.length()-1 ; i>=0; i--){
                reversed += input.charAt(i);
            }
            System.out.println(input+" = "+ reversed);

            input= scanner.nextLine();
        }


    }
}
