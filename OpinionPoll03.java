import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll03 {
    public static class Person {
        String name;
        int age;

        Person (String name, int age){
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return this.name + " - " + this.age;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> opinion = new ArrayList<>();
        for(int i =0; i<n; i++){
            String [] input = scanner.nextLine().split(" ");
            Person opinions = new Person(input[0], Integer.parseInt(input[1]));
            opinion.add(opinions);
     }
        for(Person e : opinion){
           if( e.getAge() > 30) {
               System.out.println(e.toString());
           }
        }

    }
    }

