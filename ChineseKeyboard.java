import java.util.Arrays;
import java.util.Scanner;

public class ChineseKeyboard{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input= scanner.nextLine().split(", ");
        String top = "qwertyuiop";
        String middle = "asdfghjkl";
        String bottom = "zxcvbnm";
        String [] output = new String[input.length];

        int k=0;
         for (int i = 0; i < input.length; i++) {
             int containsTop= 0;
             int containsMiddle = 0;
             int containsBottom = 0;

             String []check = input[i].toLowerCase().split("");
             for (int j = 0; j < check.length; j++) {
                 if(top.contains(check[j])){
                     containsTop=1;
                 }else if (middle.contains(check[j])){
                     containsMiddle=1;
                 }else if (bottom.contains(check[j])){
                     containsBottom=1;
                 }
             }
             if (containsTop+containsMiddle+containsBottom==1){
                 output[k]=(input[i]);
                 k++;
             }






        }
        String [] outpuut=new String[k];
        for (int j = 0; j < k; j++) {
            outpuut[j]=output[j];
        }

        System.out.println(Arrays.toString(outpuut).replace("[", "").replace("]", "").trim());





    }
        }
