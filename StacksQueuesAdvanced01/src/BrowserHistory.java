import java.util.ArrayDeque;
import java.util.Scanner;



public class BrowserHistory {
    public static ArrayDeque<String> stack = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if(stack.size()>1){
                    stack.pop();
                    System.out.println(stack.peek());
                }else {
                    System.out.println("no previous URLs");
                }
            } else {
                stack.push(input);
                System.out.println(stack.peek());

            }

            input = scanner.nextLine();
        }


    }

}
