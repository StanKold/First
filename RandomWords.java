import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] line  = scanner.nextLine().split(" ");
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(line.length);
for(int i =0; i< line.length;i++){
String actual = line[i];
line[i]=line[randomNumber];
line[randomNumber]=actual;
}


       for(String e: line ){
            System.out.println(e);
        }



    }

}
