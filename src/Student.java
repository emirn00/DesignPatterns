public class Student {
    public String name ;
    public int number;


    private Student(String name , int number){
        this.name = name ; 
        this.number = number ;
    }

    public static Student createStudent(String name , int number){
        return new Student( name ,  number);
    }

    public String toString(){

        return "Name : " +name + " " + "Number : " +number ;
    }
}
