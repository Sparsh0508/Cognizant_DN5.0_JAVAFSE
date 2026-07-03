public class EmployeeManager {

    private Employee[] employees;
    private int count;

    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count == employees.length) {
            System.out.println("Employee Array is Full!");
            return;
        }

        employees[count++] = employee;
        System.out.println("Employee Added Successfully.");
    }

    // Search Employee
    public Employee searchEmployee(int employeeId) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }

        }

        return null;
    }

    // Traverse Employees
    public void displayEmployees() {

        if (count == 0) {
            System.out.println("No Employee Records Found.");
            return;
        }

        System.out.println("\n-------------------------------------------------------------");
        System.out.printf("%-5s %-15s %-15s %s\n",
                "ID", "Name", "Position", "Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }

        System.out.println("-------------------------------------------------------------");
    }

    // Delete Employee
    public void deleteEmployee(int employeeId) {

        int index = -1;

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == employeeId) {
                index = i;
                break;
            }

        }

        if (index == -1) {
            System.out.println("Employee Not Found.");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[count - 1] = null;
        count--;

        System.out.println("Employee Deleted Successfully.");
    }
}
