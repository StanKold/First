package CompanyRoaster;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Department>> employList = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String mail = "";
            int age = 0;
            String[] line = scanner.nextLine().split("\\s+");
            if (line.length == 4) {
                mail = "n/a";
                age = -1;
            } else if (line.length == 5) {
                if (line[4].contains("@")) {
                    mail = line[4];
                    age = -1;
                } else {
                    mail = "n/a";
                    age = Integer.parseInt(line[4]);
                }
            } else if (line.length == 6) {
                mail = line[4];
                age = Integer.parseInt(line[5]);
            }
            employList.putIfAbsent(line[3], new ArrayList<>());
            employList.get(line[3]).add(new Department(line[0], Double.parseDouble(line[1]), line[2], line[3], mail, age));

        }

        String maxDepartment = "";
        double maxAverageSalary = 0;
        for (Map.Entry<String, List<Department>> d : employList.entrySet()) {

            double totalSalary = 0.00;
            List<Department> actual = d.getValue();
            for (int i = 0; i < actual.size(); i++) {
                totalSalary += actual.get(i).getSalary();
            }
            if (maxAverageSalary < (totalSalary / actual.size())) {
                maxDepartment = d.getKey();
                maxAverageSalary = totalSalary / actual.size();
            }
        }




   List <Department>best = employList.get(maxDepartment);

best.sort(Comparator.comparingDouble(b -> b.getSalary()));
Collections.reverse(best);

        System.out.println("Highest Average Salary: "+maxDepartment);
        for (Department d:best) {
            System.out.println(d.getInfo());

        }


    }
}
