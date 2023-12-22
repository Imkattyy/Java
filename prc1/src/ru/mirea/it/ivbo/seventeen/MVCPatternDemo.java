package ru.mirea.it.ivbo.seventeen;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        controller.setStudentName("Crowley");
        controller.setStudentRollNo("57");
        System.out.println("\nAfter updating,Student Details are as follows\n");
        controller.updateView();
    }

    public static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Kate");
        student.setRollNo("21");
        return student;
    }
}