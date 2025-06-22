public class Main {
    public static void main(String[] args) {
        Student model = new Student();
        model.setName("Krithi");
        model.setId("IT2025");
        model.setGrade("O");

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
