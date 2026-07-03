import java.util.Scanner;

public class TaskManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TaskLinkedList taskList = new TaskLinkedList();

        while (true) {

            System.out.println("\n========== Task Management System ==========");
            System.out.println("1. Add Task");
            System.out.println("2. Search Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Status: ");
                    String status = sc.nextLine();

                    taskList.addTask(new Task(id, name, status));
                    break;

                case 2:

                    System.out.print("Enter Task ID: ");
                    id = sc.nextInt();

                    Task task = taskList.searchTask(id);

                    if (task != null)
                        System.out.println(task);
                    else
                        System.out.println("Task Not Found.");

                    break;

                case 3:

                    taskList.displayTasks();
                    break;

                case 4:

                    System.out.print("Enter Task ID: ");
                    id = sc.nextInt();

                    taskList.deleteTask(id);
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
