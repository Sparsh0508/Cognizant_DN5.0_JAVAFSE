public class MVCPatternTest {

    public static void main(String[] args) {

        Student student = new Student(101, "Rahul", "A");

        StudentView view = new StudentView();

        StudentController controller =
                new StudentController(student, view);

        System.out.println("Initial Student Record");
        controller.updateView();

        System.out.println();

        controller.setStudentName("Amit");
        controller.setStudentGrade("A+");

        System.out.println("Updated Student Record");
        controller.updateView();
    }
}
