package Day15.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(101 , "Kushagra Varshney" , 100000.0));
		list.add(new Employee(103 , "Saksham Gupta" , 99000.0));
		list.add(new Employee(102 , "Harsh Tiwari" , 101000.0));
		
		System.out.println("Before Sorting: " + list);
		
		Collections.sort(list);    // invoking compareTo() method internally
		System.out.println("After Sorting: " + list);
	}
}
