import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> nums = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i).equals(nums.get(i + 1))) {
                nums.set(i, nums.get(i) + nums.get(i + 1));
                nums.remove(i + 1);
                i=-1;
            }

        }
        String output = joinElementsByDelimiter(nums, " ");
        System.out.println(output);
    }
    static String joinElementsByDelimiter(List<Double> items, String delimiter){
        String output ="";
        for (Double item : items){
            output += (new DecimalFormat("0.#").format(item)+delimiter);
        }
        return output;



    }
}
