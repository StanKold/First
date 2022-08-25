package examStickyFingers;

import java.util.Scanner;

public class Sticky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        String [][] field = new String[size][size];

        String[]commands = scanner.nextLine().split(",");
int money =0;
        int actualRow =0;
        int actualCow =0;
        for (int i = 0; i < size; i++) {
            field[i] = scanner.nextLine().split("\\s+");
            for (int j = 0; j < size; j++) {
                if (field[i][j].equals("D")){
                    actualRow =i;
                    actualCow =j;
                }
            }


        }


        int newRow=0;
        int newCow=0;

        boolean getCaught = false;
        for (int i = 0; i < commands.length; i++) {

          switch (commands[i]){
              case "up":
                  newRow=actualRow-1;
                  newCow=actualCow;
                  break;
              case"right":
                  newRow=actualRow;
                  newCow=actualCow+1;
                  break;
              case"down":
                  newRow=actualRow+1;
                  newCow=actualCow;
                  break;
              case"left":
                  newRow=actualRow;
                  newCow=actualCow-1;
                  break;
          }



          if(newCow>=0 && newCow<size && newRow>=0 && newRow<size && !getCaught){
            if(field[newRow][newCow].equals("P")){
                field[actualRow][actualCow]="+";
                actualRow=newRow;
                actualCow=newCow;
                field[actualRow][actualCow]="#";

               getCaught = true;
                break;

            }
              if(field[newRow][newCow].equals("$")){
                  field[actualRow][actualCow]="+";
                  actualRow=newRow;
                  actualCow=newCow;
                  field[actualRow][actualCow]="D";
                  System.out.println("You successfully stole "+(actualCow*actualRow)+"$.");
                  money+=actualCow*actualRow;
              }
              if(field[newRow][newCow].equals("+")){
                  field[actualRow][actualCow]="+";
                  field[newRow][newCow]="D";
                  actualRow=newRow;
                  actualCow=newCow;
                  }

          }else {
              newCow=actualCow;
              newRow=actualRow;
              System.out.println("You cannot leave the town, there is police outside!");
          }





        }
        if(!getCaught){
            System.out.println("Your last theft has finished successfully with "+money+"$ in your pocket.");
        }else {
            System.out.println("You got caught with "+money+"$, and you are going to jail.");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(field[i][j]+" ");;
            }
            System.out.println();
        }
















    }
}
