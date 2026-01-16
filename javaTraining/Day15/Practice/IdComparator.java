package Day15.Practice;

import java.util.Collection;
import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return Integer.compare(e1.getId() , e2.getId());
//		return Integer.compare(e2.getId() , e1.getId());
	}
}
