import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(scanner.nextLine());
double cost = 0;
double total =0;
        for (int i=1; i<=day;i++){
            for(int k =1; k<= hour; k++){

                if(i%2==0 && k%2==1){
                    cost+=2.50;
                }else if (i%2==1 && k%2==0){
                    cost +=1.25;
                }else {
                    cost+=1;
                }
            }
            total+=cost;
            System.out.printf("Day: %d - %.2f leva\n",i,cost);
            cost=0;
        }
        System.out.printf("Total: %.2f leva",total);
    }
}
