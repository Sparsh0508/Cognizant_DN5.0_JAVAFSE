import java.util.*;

public class ArraylistExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        System.out.print("How many names? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            students.add(sc.nextLine());
        }
        System.out.println("\nStudent Names:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
