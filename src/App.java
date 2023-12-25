public class App {
    public static void main(String[] args) throws Exception {
        
        Student student1 =  Student.createStudent("Emir Nar", 1);
        Student student2 =  Student.createStudent("Mehmet Yıldız", 2);
        Student student3 =  Student.createStudent("Mehmet Yıldız", 3);
        
        Course DP = new Course("Design Pattern", "Alper Bilge");
        DP.registerStudent(student1);
        DP.registerStudent(student2);

        Grade student1grade = new GradeSystem(student1 , DP);
        Grade student2grade = new GradeSystem(student2, DP);

        student1grade = new VisaGradeDecorator(student1grade, 60);
        student1grade = new ProjectGradeDecorator(student1grade, 60);
        student1grade = new FinalGradeDecorator(student1grade, 90);

        student2grade = new VisaGradeDecorator(student2grade, 45);
        student2grade = new ProjectGradeDecorator(student2grade, 80);
        student2grade = new FinalGradeDecorator(student2grade, 80);
        DP.printStudents();

        
        System.out.println(student1grade.calculateGrade());
        System.out.println(student2grade.calculateGrade());
        
        

        

        

        
    }
}
