import java.util.Scanner;

public class exam2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
double budget = Double.parseDouble(scanner.nextLine());
int nights = Integer.parseInt(scanner.nextLine());
double cost = Double.parseDouble(scanner.nextLine());
double extra= Double.parseDouble(scanner.nextLine());

        double discount=1.0;
  if (nights>7){
      discount -= 0.05;
 }
 double total = nights*cost*discount+(budget*extra/100.0);
  if(budget >= total){
      System.out.printf("Ivanovi will be left with %.2f leva after vacation.",(budget-total));
  }else{
      System.out.printf("%.2f leva needed.",total-budget);
  }

    }
}
