package Day15.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(101 , "Kushagra Varshney" , 100000.0));
		list.add(new Employee(103 , "Saksham Gupta" , 99000.0));
		list.add(new Employee(102 , "Harsh Tiwari" , 101000.0));
		
		
		
		// Comparator for sorting by name
		Comparator<Employee> idComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1 , Employee e2) {
//				return e1.getId().compareTo(e2.getId());
				return Integer.compare(e1.getId() , e2.getId());
			}
		};
		
		
		// Comparator for sorting by name
		Comparator<Employee> nameComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1 , Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		};
		
		
		// Comparator for sorting by name
		Comparator<Employee> salaryComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1 , Employee e2) {
				return Double.compare(e1.getSalary() , e2.getSalary());
			}
		};
		
		

		System.out.println("Before Sorting: " + list);
		
		Collections.sort(list , idComparator);
		System.out.println("After Sorting based on empId: " + list);
		
		Collections.sort(list , nameComparator);
		System.out.println("After Sorting based on empName: " + list);
		
		Collections.sort(list , salaryComparator);
		System.out.println("After Sorting based on empSalary: " + list);
		
		
//		-------------------------------------------------------------------------------------------------
		
		IdComparator ic1 = new IdComparator();
		NameComparator nc1 = new NameComparator();
		SalaryComparator sc1 = new SalaryComparator();
		
		TreeSet<Employee> ts=new TreeSet<Employee>(ic1);
		
		ts.add(new Employee(101 , "Kushagra Varshney" , 100000.0));
		ts.add(new Employee(103 , "Saksham Gupta" , 99000.0));
		ts.add(new Employee(102 , "Harsh Tiwari" , 101000.0));
		System.out.println(ts);
		
		List<Employee> list2 = new ArrayList<>();
		list2.add(new Employee(1001 , "Kushagra Varshney" , 100000.0));
		list2.add(new Employee(1003 , "Saksham Gupta" , 99000.0));
		list2.add(new Employee(1002 , "Harsh Tiwari" , 101000.0));
		
		Collections.sort(list2 , nc1);
		System.out.println(list2);
		
		Set<Employee> set2 = new TreeSet<>(sc1);
		
//		-------------------------------------------------------------------------------------------------
		
		Employee e1 = new Employee(101, "Kushagra", 100000);
		Employee e2 = new Employee(102, "Harsh", 99000);

		// Using Employee's compareTo()
		int result1 = e1.compareTo(e2);  
		// Calls: Employee.compareTo() → returns 101 - 102 = -1

		// Using NameComparator's compare()
		NameComparator nc = new NameComparator();
		int result2 = nc.compare(e1, e2);
		// Flow:
		// 1. Calls NameComparator.compare(e1, e2)
		// 2. Gets e1.getName() = "Kushagra"
		// 3. Gets e2.getName() = "Harsh"
		// 4. Calls "Kushagra".compareTo("Harsh")  ← String's method
		// 5. String class compares 'K' and 'H' → K > H → returns positive
	}

}
