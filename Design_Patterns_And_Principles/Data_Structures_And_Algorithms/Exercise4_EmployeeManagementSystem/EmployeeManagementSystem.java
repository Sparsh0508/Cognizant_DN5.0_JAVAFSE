import java.util.Scanner;

public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeManager manager = new EmployeeManager(10);

        while (true) {

            System.out.println("\n========= Employee Management System =========");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Position: ");
                    String position = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    manager.addEmployee(new Employee(id, name, position, salary));
                    break;

                case 2:

                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();

                    Employee employee = manager.searchEmployee(id);

                    if (employee != null)
                        System.out.println(employee);
                    else
                        System.out.println("Employee Not Found.");

                    break;

                case 3:

                    manager.displayEmployees();
                    break;

                case 4:

                    System.out.print("Enter Employee ID: ");
                    id = sc.nextInt();

                    manager.deleteEmployee(id);
                    break;

                case 5:

                    System.out.println("Thank You!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid Choice.");
            }
        }
    }
}
