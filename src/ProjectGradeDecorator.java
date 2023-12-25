public class ProjectGradeDecorator extends GradeDecorator {
    Grade grade;
    private int ProjectGrade ;

    public ProjectGradeDecorator(Grade grade , int ProjectGrade){
        super(grade);
        this.ProjectGrade = ProjectGrade;
    }

    @Override
    public int calculateGrade() {
        return super.calculateGrade() +ProjectGrade*30/100;
    }

    @Override
    public Course getCourse() {
        return grade.getCourse();
    }

    @Override
    public Student getStudent() {
        return grade.getStudent();
    }
}

