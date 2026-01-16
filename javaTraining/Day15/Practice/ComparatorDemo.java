package Day15.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
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
		
		
		
		
		IdComparator ic1 = new IdComparator();
		NameComparator nc1 = new NameComparator();
		
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
	}

}
