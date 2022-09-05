import java.util.Arrays;
import java.util.Scanner;

public class MatrixRules {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] input = Arrays.stream(scanner.nextLine().split("")).mapToInt(Integer::parseInt).toArray();
        int[]output =new int [input.length];
        int previous=0;
        int next =0;
        for (int i = 0; i < input.length; i++) {
            previous = i-1;
            if (previous<0){
                previous= input.length-1;
            }
            next = i+1;
            if (next == input.length){
                next=0;
            }


            if (input[i] == 0 && input[previous]==1&& input[next]==1) {
                output[i] = 1;
            }else if (input[i] == 1 && input[previous]== input[next]) {
                output[i] = 0;
            }else{output[i]= input[i];}

        }
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }


    }
}
