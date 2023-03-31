package assessment2;

import java.util.List;

public interface EmployeeDAO {
	void createEmployee(List<Employee> employees);
	void updateEmployee(List<Employee> employees);
	void deleteEmployee(List<Employee> employees);
	void printEmployees(List<Employee> employees);
	void findEmployee(List<Employee> employees);
	void sortEmployees(List<Employee> employees);
}
