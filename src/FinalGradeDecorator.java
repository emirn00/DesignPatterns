public class FinalGradeDecorator extends GradeDecorator {
    Grade grade;
    private int FinalGrade ;

    public FinalGradeDecorator(Grade grade , int FinalGrade){

        super(grade);
        this.FinalGrade = FinalGrade;
    }

    @Override
    public int calculateGrade() {
        return super.calculateGrade() +FinalGrade;
    }
}
