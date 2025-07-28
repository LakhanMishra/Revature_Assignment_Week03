import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmployeeList {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Lakhan", 50000));
        list.add(new Employee(102, "Sanjana", 70000));
        list.add(new Employee(103, "Amit", 60000));

        Collections.sort(list);
        System.out.println("Sorted by name (Comparable):");
        for (Employee e : list) {
            System.out.println(e);
        }

        Collections.sort(list, new SalaryComparator());
        System.out.println("\nSorted by salary (Comparator):");
        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
