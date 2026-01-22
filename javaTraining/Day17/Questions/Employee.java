package Day17.Questions;

public class Employee {
	int empId;
	String empName;
	String empDept;
	double empSalary;
	
	public Employee(int empId, String empName, String empDept, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSalary = empSalary;
	}
	
	public int getId() {
		return this.empId;
	}
	
	@Override
	public String toString() {
		return this.empId + "  " + this.empName + "  " + this.empDept + "  " + this.empSalary;
	}
}
