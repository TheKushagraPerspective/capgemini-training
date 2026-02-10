package Day15.Practice;

public class Employee implements Comparable<Employee> {
	public int empId;
	public String empName;
	public double empSalary;
	
	public Employee(int empId , String empName , double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	@Override
	public int compareTo(Employee other) {
		return this.empId - other.empId;    // in ascending order
//		return other.empId - this.empId;    // in descending order
	}
	
	// Getters
    public int getId() { return empId; }
    public String getName() { return empName; }
    public double getSalary() { return empSalary; }
    
    @Override
    public String toString() {
        return "Employee{id=" + empId + ", name='" + empName + "', salary=" + empSalary + "}";
    }
}
