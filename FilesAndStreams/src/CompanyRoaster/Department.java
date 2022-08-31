package CompanyRoaster;

public class Department {
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    public Department(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getInfo(){
        return String.format("%s %.2f %s %d",name,salary,email,age);




    }
}
