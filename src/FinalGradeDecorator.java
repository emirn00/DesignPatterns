public class FinalGradeDecorator implements GradeInterface {
    private Grade grade;

    FinalGradeDecorator(Grade grade){
        this.grade = grade;
    }
    @Override
    public String GradeInfo() {
        // TODO Auto-generated method stub
        return grade.GradeInfo() + "Final grade added";
    }
    
}

