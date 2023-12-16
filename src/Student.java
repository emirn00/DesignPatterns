public class Student {
    public String name ;
    public int number;


    protected Student(String name , int number){
        this.name = name ; 
        this.number = number ;
    }

    public String toString(){

        return "Name : " +name + " " + "Number : " +number ;
    }
}


