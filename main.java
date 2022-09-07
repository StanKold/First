import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();
int [] n = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
int ronnie = Integer.parseInt(input);
        input =scanner.nextLine();
int [] r = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
        int reanne = Integer.parseInt(input);
int[]resultRo = new int[n.length];
int[]resultRe = new int[r.length];



for (int i = 0; i < n.length; i++) {
    if(n[i]!= 0){
if (ronnie%n[i] ==0){
    resultRo[i]=n[i];
}
    }
}

for (int i = 0; i < r.length; i++) {
    if(r[i]!= 0){
            if (reanne%r[i] ==0){
                resultRe[i]=r[i];
            }
    }
        }
 ronnie = Integer.parseInt(Arrays.toString(resultRo).replace("[", "").replace("]", "").replace(", ", "").replace("0", "").trim());
 reanne = Integer.parseInt(Arrays.toString(resultRe).replace("[", "").replace("]", "").replace(", ", "").replace("0", "").trim());


if(ronnie>reanne){
    System.out.println("Ronnie "+ronnie);
}else if (ronnie<reanne){
    System.out.println("Reanne "+reanne);
}else {
    System.out.println("Tie "+reanne);
}



    }
}
