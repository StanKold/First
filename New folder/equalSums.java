import java.util.Arrays;
import java.util.Scanner;

public class equalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that determines if there exists an element in the array
        // such that the sum of the elements on its left is equal to the sum of
        // the elements on its right. If there are no elements to the left/right,
        // their sum is considered to be 0. Print the index that satisfies the
        // required condition or "no" if there is no such index.

        String input = scanner.nextLine();
        int [] line = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray() ;
boolean no = true;
        for(int i=0; i< line.length; i++){
            int left =0;
            int right =0;
            for(int k=0; k<i;k++){
            left += line[k];
            }
            for(int j=i+1; j<= line.length-1;j++){
                right += line[j];
            }

            if( right == left){
                System.out.print(i+" ");
                no=false;
            }
            }
        if(no){
            System.out.print("no");
        }

        }


    }

