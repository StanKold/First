import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(scanner.nextLine());

        for(int i =0; i< sb.length();i++){
            if (sb.charAt(i) == '>') {
               int triger = i;
               i++;
                char symbol = sb.charAt(i);
                int power = Character.getNumericValue(symbol);
                 while( 0 < power ) {
                        if (sb.charAt(i) == '>') {
                            symbol = sb.charAt(i + 1);
                            power += Character.getNumericValue(symbol);
                            i++;

                            continue;
                        }
                        sb.deleteCharAt(i);
                        power--;
                        if (power == 0) {
                            break;
                        }
                    }


            }
        }
        System.out.println(sb);

    }
}
