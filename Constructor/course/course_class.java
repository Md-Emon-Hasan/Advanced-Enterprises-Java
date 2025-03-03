package course;

public class course_class {
    String name;
    int id;
    
    public course_class(){
        System.out.println("Default Constructor");
    }
    
    public course_class(String s, int i){
        this.name = s;
        this.id = i;
    }
    
    public void display(){
        System.out.println("Your Course "+name+" Course ID: "+id);
    }
}
