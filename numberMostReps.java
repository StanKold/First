import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class numberMostReps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<Integer, Integer> nums= new HashMap<>();
        for (int i = 0; i <n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            nums.putIfAbsent(input, 0);
            nums.put(input,nums.get(input)+1);
        }
n=0;
        int count = 0;
        for (Map.Entry<Integer, Integer> entry: nums.entrySet()) {

            if(count < entry.getValue()){
                n= entry.getKey();
                count =entry.getValue();
            } if(count == entry.getValue() && n > entry.getKey()){
                n= entry.getKey();
            }
        }
        System.out.println(n);

        







    }
}
