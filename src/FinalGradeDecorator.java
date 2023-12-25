public class FinalGradeDecorator extends GradeDecorator {
    Grade grade;
    private int FinalGrade ;

    public FinalGradeDecorator(Grade grade , int FinalGrade){

        super(grade);
        this.FinalGrade = FinalGrade;
    }

    @Override
    public int calculateGrade() {
        return super.calculateGrade() +FinalGrade*40/100;
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
