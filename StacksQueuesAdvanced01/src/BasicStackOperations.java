import java.util.*;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();
         scanner.nextLine();
       String [] line =scanner.nextLine().split(" ");
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        for (int i =0; i < n;i++) {
            numbers.push(Integer.parseInt(line[i]));
        }
        for (int i =0; i < s;i++) {
            numbers.pop();
        }

        if(numbers.contains(x)){
            System.out.println("true");
        }else if (numbers.isEmpty()){
            System.out.println(0);
        }else {
            System.out.println(Collections.min(numbers));
        }

    }
}
