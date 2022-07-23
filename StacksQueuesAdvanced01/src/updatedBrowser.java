import java.util.ArrayDeque;
import java.util.Scanner;

public class updatedBrowser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> forward = new ArrayDeque<>();

        String input = scanner.nextLine();

        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if(stack.size()>1){
                    forward.push(stack.pop());
                    System.out.println(stack.peek());
                }else {
                    System.out.println("no previous URLs");
                }
            }else if(input.equals("forward")){
                if(forward.size()<1){
                    System.out.println("no next URLs");
                }else {
                    stack.push(forward.peek());
                    System.out.println(forward.pop());
                }

            } else {
                stack.push(input);
                forward.clear();
                System.out.println(stack.peek());

            }

            input = scanner.nextLine();
        }






    }
}
