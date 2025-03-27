class Animal{
    String name;
    void eat(){
        System.out.println(name+ " this can eat");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println(name + " this braking at me");
    }
}

public class InheritenceExample {
    public static void main(String[] args) {
        System.out.println("Main function ");
        
        Dog mydog = new Dog();
        
        mydog.name = "Tom";
        
        mydog.eat();
        mydog.sound();
    }
}
