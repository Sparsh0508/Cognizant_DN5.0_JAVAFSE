public class TaskLinkedList {

    private class Node {

        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    public void addTask(Task task) {

        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        System.out.println("Task Added Successfully.");
    }

    public Task searchTask(int taskId) {

        Node current = head;

        while (current != null) {

            if (current.task.getTaskId() == taskId) {
                return current.task;
            }

            current = current.next;
        }

        return null;
    }

    public void displayTasks() {

        if (head == null) {
            System.out.println("No Tasks Available.");
            return;
        }

        System.out.println("\n----------------------------------------------");
        System.out.printf("%-5s %-20s %-15s\n",
                "ID", "Task Name", "Status");
        System.out.println("----------------------------------------------");

        Node current = head;

        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }

        System.out.println("----------------------------------------------");
    }

    public void deleteTask(int taskId) {

        if (head == null) {
            System.out.println("Task List is Empty.");
            return;
        }

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            System.out.println("Task Deleted Successfully.");
            return;
        }

        Node current = head;

        while (current.next != null &&
                current.next.task.getTaskId() != taskId) {

            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Task Not Found.");
            return;
        }

        current.next = current.next.next;

        System.out.println("Task Deleted Successfully.");
    }
}
