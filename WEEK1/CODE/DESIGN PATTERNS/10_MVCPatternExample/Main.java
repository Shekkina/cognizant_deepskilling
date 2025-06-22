public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", 1, "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        controller.updateView();
    }
}