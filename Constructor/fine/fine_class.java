package fine;

public class fine_class {
    String name;
    int fine;
    
    public fine_class(){
        System.out.println("Default constructor");
    }
    
    public fine_class(String s, int i){
        this.name = s;
        this.fine = i;
    }
    
    public void display(){
        System.out.println("Your Name: "+name+" Your Fine: "+fine);
    }
}
