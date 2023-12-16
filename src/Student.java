public class Student implements StudentInterface{
    public String name ;
    public int number;


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
}

interface StudentInterface{
    void update(String x);
}


