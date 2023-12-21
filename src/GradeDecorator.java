public abstract class GradeDecorator implements Grade{
    
    protected Grade grade ;

    GradeDecorator(Grade grade){
        this.grade  = grade ;
    }

    @Override
    public int calculateGrade() {
        return grade.calculateGrade();
    }
}
