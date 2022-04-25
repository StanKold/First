import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class p07OrderByAge {
    public static class People {
        String name;
        String ID;
        int age;

        public People(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getID() {
            return ID;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return getName()+" with ID: "+getID()+" is "+getAge()+" years old.";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<People> peopleList = new ArrayList<>();
        while(!input.equals("End")){
            String [] comand = input.split(" ");
            peopleList.add(new People(comand[0],comand[1],Integer.parseInt(comand[2]) ));
            input= scanner.nextLine();
        }

        peopleList.sort(Comparator.comparing(People::getAge));


        for(People p : peopleList) {
            System.out.println(p.toString());
        }
    }
}
