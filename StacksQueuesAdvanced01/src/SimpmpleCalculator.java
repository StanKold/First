import java.util.*;

public class SimpmpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> inputs = new ArrayDeque<>();
        for (int i = input.length-1; i>=0; i--) {
            inputs.push(input[i]);
        }
        int result = 0;
        while (inputs.size() > 1) {
            int a = Integer.parseInt(inputs.pop());
            String operation = inputs.pop();
            int b = Integer.parseInt(inputs.pop());

            if (operation.equals("+")) {
                result = a + b;

            } else {
                result = a - b;
            }

inputs.push(result+"");
        }
        System.out.println(inputs.pop());

    }


}
