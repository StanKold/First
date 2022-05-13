import java.util.Scanner;

public class CharMyultiplyer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");
        String one="";
        String two="";
        int sum=0;
        if (input[0].length() > input[1].length()) {
             one = input[0];
            two = input[1];
        }else{
            one = input[1];
             two = input[0];
        }
        for(int i=0; i< two.length();i++){
            sum += one.charAt(i)*two.charAt(i);
        }
        for(int k=two.length(); k<one.length();k++){
            sum+=one.charAt(k);
        }
        System.out.println(sum);

    }
}
