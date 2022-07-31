import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int s = scanner.nextInt();
        scanner.nextLine();
        ArrayDeque<Integer> nums = new ArrayDeque<>();
        int [] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i =0; i <n;i++){
            nums.offer(input[i]);
        }
        for(int i =0; i<x;i++){
            nums.poll();
        }
if(nums.contains(s)){
    System.out.println("true");
}else if (nums.isEmpty()){
    System.out.println(0);
}else{
    System.out.println(Collections.min(nums));
}


    }
}
