import java.util.*;

public class Students {
    public static class Book{
        String firstName;
        String lastName;
        double grade;

        Book(String firstName, String lastName, double grade){
            this.firstName=firstName;
            this.lastName=lastName;
            this.grade=grade;

        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getGrade() {
            return grade;
        }
        public void setGrade(double grade) {
            this.grade= grade;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List <Book> students = new ArrayList<>();

        for(int i =0; i<n;i++){
            String [] input = scanner.nextLine().split(" ");
            String name1=input[0];
            String name2=input[1];
            double name3=Double.parseDouble(input[2]);

            students.add(new Book(name1, name2, name3));
            }


students.sort(Comparator.comparing(Book::getGrade).reversed());

for(Book stud : students){
                System.out.printf("%s %s: %.2f%n" ,stud.getFirstName(),stud.getLastName(),stud.getGrade());
            }
        }
    }


