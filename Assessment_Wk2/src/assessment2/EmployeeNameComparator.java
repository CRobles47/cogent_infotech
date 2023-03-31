package assessment2;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeName().compareTo(o2.getEmployeeName());
	}
	
}
