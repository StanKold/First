import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
String [] line = input.split(" ");
int n = Integer.parseInt(scanner.nextLine());
        String actual="";
for(int i =0; i< n; i++){
    actual = line[0];
    for(int k=0; k< line.length-1; k++){
         line[k]=line[k+1];
    }
    line[line.length-1]=actual;


}
for(String element: line) {
    System.out.print(element+ " ");
}
    }
}
