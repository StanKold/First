import java.util.Scanner;

public class SubstringRemoveLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String one = scanner.nextLine();
        String two = scanner.nextLine();
StringBuilder result = new StringBuilder();
result.append(two);
        char ones;
        char twos;
        for(int i =0; i<one.length();i++){
            for(int k = 0; k<result.length();k++){
                ones = one.charAt(i);
                twos = result.charAt(k);
                if( ones == twos ){
                    result.deleteCharAt(k);
                    k--;

                }
            }
                    }
        System.out.println(result);

    }
}
