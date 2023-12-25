public class VisaGradeDecorator extends GradeDecorator {
    Grade grade;
    private int visaGrade ;

    public VisaGradeDecorator(Grade grade , int visaGrade){       
        super(grade);
        this.visaGrade = visaGrade ;
    }

    @Override
    public int calculateGrade() {
        return super.calculateGrade() +visaGrade*30/100;
    }
}
