import java.util.Arrays;
import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] line = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] input = Arrays.stream(scanner.nextLine().split(",")).mapToInt(Integer::parseInt).toArray();
        int[] output = new int[line.length];

        for (int i = 0; i < line.length; i++) {
            for (int j = 0; j < input.length; j++) {

                if (line[i] == input[j]) {
                    for (int k = j + 1; k < input.length; k++) {
                        if (line[i] < input[k]) {
                            output[i] = input[k];
                            break;
                        } else {
                            output[i] = -1;
                        }
                    }

                    break;
                }
                else{
                    output[i] = -1;
                }

            }



        }
        System.out.println(Arrays.toString(output).replace("[", "")
                .replace("]", "").replace(" ", "").trim());

    }
}

