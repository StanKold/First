import java.util.Scanner;

public class exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String element = scanner.nextLine();
double points = 0.0;
        switch (country){
            case "Russia":
                if(element.equals("ribbon")){
                    points+=18.5;
                }else if(element.equals("hoop")){
                    points+=19.1;
                }else if(element.equals("rope")){
                    points+=18.6;
                }
                break;
            case "Bulgaria":
                if(element.equals("ribbon")){
                    points+=19.0;
                }else if(element.equals("hoop")){
                    points+=19.3;
                }else if(element.equals("rope")){
                    points+=18.9;
                }
                break;
            case "Italy":
                if(element.equals("ribbon")){
                    points+=18.7;
                }else if(element.equals("hoop")){
                    points+=18.8;
                }else if(element.equals("rope")){
                    points+=18.85;
                }
                break;
        }
        System.out.printf("The team of %s get %.3f on %s.\n",country,points,element);
        points=(20-points)*100/20;
        System.out.printf("%.2f%%",points);

    }
}
