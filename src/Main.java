import my_package.*;

public class Main {
    public static void main(String[] args) {

        String[] studentNames = {
                "Ali",
                "Ajaz",
                "Akram",
                "Akeel",
        };
        String[] departmentNames = {
                "Computer Science",
                "Mathematics",
                "Physics"
        };

        University university = new University(studentNames, departmentNames, "Mehran.\n");


        System.out.println("\nUniversity Name : " + university.getName());
        System.out.println("List of Students and Departments is given.\n");


        university.enrollIn(university.getDepartment("Computer Science"), university.getStudent("Ali"));
        university.enrollIn(university.getDepartment("Mathematics"), university.getStudent("Ajaz"));
        university.enrollIn(university.getDepartment("Physics"), university.getStudent("Akram"));
        university.enrollIn(university.getDepartment("Physics"), university.getStudent("Akeel"));

        university.display();

        System.out.println();
        university.print_student_name("Physics");
    }
}