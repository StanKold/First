import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CompanyRoster {
    public static class Depart {
        double salary;
        String department;
        int count = 0;


        public void setCount(int c) {
            this.count = count + c;
        }

        public Depart(double salary, String department) {
            this.salary = salary;
            this.department = department;
            this.count++;
        }

        public double getSalary() {
            return salary;
        }

        public String getDepartment() {
            return department;
        }

        public int getCount() {
            return count;
        }

        public void setSalary(double add) {
            this.salary = salary + add;
        }
    }

    public static class Employee {
        String name;
        double salary;
        String position;
        String department;
        String email;
        int age;

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public String getPosition() {
            return position;
        }

        public String getDepartment() {
            return department;
        }

        public String getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }

        public Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Employee> peoples = new ArrayList<>();
        List<Depart> departList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            boolean notexist = true;
            String email = "n/a";
            int age = -1;
            if (input.length == 5) {
                if (input[4].indexOf('@') > 0) {
                    email = input[4];
                    age = -1;
                } else {
                    email = "n/a";
                    age = Integer.parseInt(input[4]);
                }
            } else if (input.length == 6) {
                email = input[4];
                age = Integer.parseInt(input[5]);
            }
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];

            peoples.add(new Employee(name, salary, position, department, email, age));
            for (Depart d : departList) {
                if (d.getDepartment().equals(department)) {
                    d.setSalary(salary);
                    d.setCount(1);
                    notexist = false;
                }

            }
            if (notexist) {
                departList.add(new Depart(salary, department));
            }
        }
        String bestDeparment = "";
        double maxAverageSalary = 0.00;
        for (Depart e : departList) {

            if ((e.getSalary() / e.getCount()) > maxAverageSalary) {
                maxAverageSalary = e.getSalary() / e.getCount();
                bestDeparment = e.getDepartment();
            }
        }
        System.out.println("Highest Average Salary: " + bestDeparment);

        peoples.sort(Comparator.comparing(Employee::getSalary).reversed());
        for (Employee p : peoples) {
            if (p.getDepartment().equals(bestDeparment)) {
                System.out.printf("%s %.2f %s %s%n",p.getName(),p.getSalary(),p.getEmail(),p.getAge());
            }
        }

    }
}
