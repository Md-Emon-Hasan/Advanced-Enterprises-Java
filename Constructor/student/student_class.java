package student;

public class student_class {
    String name;
    int id;
    
    public student_class(){
        System.out.println("Default constructor");
    }
    
    public student_class(String s, int i){
        this.name = s;
        this.id = i;
    }
    
    public void display(){
        System.out.println("Your Name: "+name+" Your ID: "+id);
    }
}