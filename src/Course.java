import java.util.ArrayList;
import java.util.List;

public class Course implements Subject {
    private final List<Student> enrollingStudents = new ArrayList<>();
    private String CourseName ;
    private String InstructorName ;


    public Course(String CourseName , String InstructorName){
        this.CourseName = CourseName ; 
        this.InstructorName = InstructorName ;
    }
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

    void printObservers(){
        for (Student student : enrollingStudents) {
            System.out.println(student.name);
        }
    }

    @Override
    public String toString() {
        return "Course Name : " +CourseName + ", " + "Course Instructor : " +InstructorName ;
    }
    
    
}
