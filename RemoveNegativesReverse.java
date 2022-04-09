import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> List = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());



        for(int i =0; i< List.size(); i++){
            if(List.get(i)<0){
                List.remove(i);
                i--;
            }
        }

        for(int z = List.size()-1; z>=0; z--){
            System.out.print(List.get(z)+ " ");
        }
        if(List.isEmpty())
        {
            System.out.println("empty");
        }

    }
}
