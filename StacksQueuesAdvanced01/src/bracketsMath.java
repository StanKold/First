import java.util.ArrayDeque;
import java.util.Scanner;

public class bracketsMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputs = input.toCharArray();

        ArrayDeque<Integer> index = new ArrayDeque<>();
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i]=='(') {
                index.push(i);
            }else if(inputs[i]==')'){
                System.out.println(input.substring(index.pop(),i+1));
            }

        }


    }
}
