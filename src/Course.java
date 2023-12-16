import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {
    private final List<Student> enrollingStudents = new ArrayList<>();
    private String CourseName ;
    private String InstructorName ;

    @Override
    public void registerStudent(Student student) {
        enrollingStudents.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        enrollingStudents.remove(student);
    }

    @Override
    public void notifyStudent(Student student) {
        for (Student students : enrollingStudents) {
            students.update("Update");
        }
    }

    @Override
    public String toString() {
        return "Course Name : " +CourseName + ", " + "Course Instructor : " +InstructorName ;
    }
    
    
}
