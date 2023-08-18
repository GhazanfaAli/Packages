
package my_package;
import java.util.ArrayList;
public class Student {
    private String sname;
    private Department dept;

    public Student(String sname) {
        this.sname = sname;
    }

    public String getSname() {
        return this.sname;
    }

    public void setDept(Department d) {
        this.dept = d;
    }

    public String toString() {
        return sname;
    }

}