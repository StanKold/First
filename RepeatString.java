import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//hi abc add
        String[]input = scanner.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length; i++ ){
            for(int k = 0; input[i].length() > k; k++){
             sb.append(input[i]);
            }

        }
        System.out.println(sb);


    }
}
