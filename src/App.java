public class App {
    public static void main(String[] args) throws Exception {
        
        Student student1 =  Student.createStudent("Emir Nar", 1);
        Student student2 =  Student.createStudent("Mehmet Yıldız", 2);
        

        Course DP = new Course("Design Pattern", "Alper Bilge");
        DP.registerStudent(student1);
        DP.registerStudent(student2);

        Grade dpgrade = new GradeSystem();
        
        System.out.println("****************");

        System.out.println(DP);

        DP.printStudents();

        dpgrade = new VisaGradeDecorator(dpgrade, 60);
        dpgrade = new ProjectGradeDecorator(dpgrade, 70);
        dpgrade = new FinalGradeDecorator(dpgrade, 90);
        System.out.println(dpgrade.calculateGrade());
        
        

        

        

        
    }
}
