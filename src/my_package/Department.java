package my_package;
import java.util.ArrayList;
public class Department {

    private String dname;
    private ArrayList < Student > std = new ArrayList < > ();
    public ArrayList<Student> getStudents() {
        return std;
    }
  public Department(String dname) {
        this.dname = dname;
    }

    public String getDname() {
        return this.dname;
    }

    public void addStudent(Student s) {
        std.add(s);
    }

    public void display() {
        for (int i = 0; i < std.size(); i++) {
            //            System.out.println(Student.get(i).getsname());
            System.out.println("Student : " + std.get(i));
        }
    }
}
