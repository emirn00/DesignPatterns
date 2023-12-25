public class GradeSystem implements Grade{
    private Student student ;
    private Course course ;

    GradeSystem(Student student , Course course){
        this.student = student;
        this.course = course ;
    }
    @Override
    public int calculateGrade() {
        return 0 ;  
    }

    @Override
    public Course getCourse() {
       
        return course;
    }

    @Override
    public Student getStudent() {
        return student ;
    }
    
}
