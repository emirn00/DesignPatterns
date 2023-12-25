import java.util.HashSet;
import java.util.Set;

public class Student implements StudentOperations{
    private String name ;
    private int number;
    private static Set<Integer> existingNumbers = new HashSet<>();
    

    private Student(String name , int number){
        this.name = name;
        this.number = number;   
        existingNumbers.add(number);
    }

    public String toString(){

        return "Name : " +name + " " + "Number : " +number ;
    }

    public static Student createStudent(String name , int number){

        if (existingNumbers.contains(number)) {
            throw new IllegalArgumentException("There is already a student have this number!");
        }

        return new Student(name, number);

        
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

interface StudentOperations{
    void update(String x);
}


