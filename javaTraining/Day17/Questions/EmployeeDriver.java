package Day17.Questions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(103 , "Manish" , "Tester" , 36626.05));
		list.add(new Employee(101 , "Dheraj" , "Manager" , 46626.05));
		list.add(new Employee(104 , "Rajeev" , "Devops" , 66626.05));
		list.add(new Employee(102 , "Kushagra" , "Developer" , 50624.05));
		
		Comparator<Employee> comp = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1 , Employee e2) {
				return Integer.compare(e1.getId() , e2.getId());
			}
		};
		
		Collections.sort(list , comp);
		
		
		String path = "D:\\capgemini-training\\Employee.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			bw.write("ID   Name     Department   Salary");
			bw.newLine();
			
			for(Employee emp : list) {
				bw.write(emp.toString());
				bw.newLine();
			}
			
			bw.close();
		}
		catch(Exception e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

}
