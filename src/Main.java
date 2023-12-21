public class Main {
    public static void main(String[] args) throws Exception {
        
        Student student1 =  Student.createStudent("Emir Nar", 1);
        Student student2 =  Student.createStudent("Mehmet Yıldız", 2);
        

        Course DP = new Course("Design Pattern", "Alper Bilge");
        DP.registerStudent(student1);
        DP.registerStudent(student2);


        System.out.println(DP);

        DP.printStudents();

        DP.removeStudent(student1);
        System.out.println("************");
        DP.printStudents();
        student1.update("update");

        
        

        

        

        
    }
}
