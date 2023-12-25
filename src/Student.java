public class Student implements StudentInterface{
    private String name ;
    private int number;

    private Student(String name , int number){
        this.name = name ; 
        this.number = number ;
    }

    public String toString(){

        return "Name : " +name + " " + "Number : " +number ;
    }

    public static Student createStudent(String name , int number){
        return new Student(name , number);
    }

    @Override
    public void update(String x) {
        
        System.out.println(x);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

}

interface StudentInterface{
    void update(String x);
}


