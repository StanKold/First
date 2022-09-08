import java.util.Scanner;

public class crooked {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            if(!input[i].equals("-") && !input[i].equals(".")&& !input[i].equals("0")){
                sb.append(input[i]);
            }
        }
        sb.append(0);
        int n=0;
        for (int i = 0; i < sb.length(); i++) {
             n += Integer.parseInt(String.valueOf(sb.charAt(i)));
        }



        while (n>9){
            int actual = 0;
            while(n>0){
                actual += n%10;
                n=n/10;

            }
            n=actual;


        }
        System.out.println(n);
    }
}
