import java.util.ArrayDeque;
import java.util.Scanner;


public class BalancedParanthese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean isBalanced = true;

        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i =0; i< input.length(); i++) {
            char actual = input.charAt(i);
            if (actual == '{' || actual=='[' || actual=='(') {
                stack.push(actual);

            } else {
                if(stack.isEmpty()){
                    isBalanced = false;
                    System.out.println("NO");
                    break;
                }
                char poped = stack.pop();
                if (poped=='{' && actual=='}' || poped=='[' && actual==']' || poped=='(' && actual==')') {
                } else {
                    isBalanced = false;
                    System.out.println("NO");
                    break;
                }
            }
        }
        if (isBalanced && stack.isEmpty()) {
            System.out.println("YES");
        } else if (isBalanced && !stack.isEmpty()) {
            System.out.println("NO");
        }

    }
}