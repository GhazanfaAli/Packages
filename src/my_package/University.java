package my_package;
import java.util.ArrayList;
public class University {
    private String u_name;
    private ArrayList < Student > students = new ArrayList < > ();
    private ArrayList < Department > departments = new ArrayList < > ();

    public University(String[] sname, String[] dname, String u_name) {

        for (String name: sname) {
            students.add(new Student(name));
        }
        for (String name: dname) {
            departments.add(new Department(name));
        }
        this.u_name = u_name;
    }

    public String getName() {
        return u_name;
    }

    public Department getDepartment(String dkey) {
        for (Department department: departments) {
            if (department.getDname().equals(dkey)) {
                return department;
            }
        }
        return null;
    }

    public Student getStudent(String skey) {
        for (Student student: students) {
            if (student.getSname().equals(skey)) {
                return student;
            }
        }
        return null;
    }

    public void enrollIn(Department d, Student s) {
        d.addStudent(s);
        s.setDept(d);
    }

    public void display() {
        for (Department department: departments) {
            System.out.println("Department: " + department.getDname());
            department.display();
            System.out.println("---------------------------------");
        }
    }
    public void print_student_name(String d_name) {
        Department department = getDepartment(d_name);
        if (department != null) {
            System.out.println("Students in Department " + d_name + ":");
            for (Student student : department.getStudents()) {
                System.out.println(student.getSname());
            }
        } else {
            System.out.println("Department " + d_name + " not found.");
        }
    }



}