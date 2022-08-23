package OpinionPool;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
List<Peoples> peoplesList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split("\\s+");
            peoplesList.add(new Peoples(input[0],Integer.parseInt(input[1])));
        }
List<Peoples>filtered= peoplesList.stream().filter(p -> p.getAge() > 30).collect(Collectors.toList());
filtered.sort(Comparator.comparing(p->p.getName()));

        for (Peoples p: filtered) {
            System.out.println(p.getName()+" - "+p.getAge());
        }


    }
}
