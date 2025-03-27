class Car{
    void name(){
        System.out.println("abc");
    }
}

class A extends Car{
    void name(){
        System.out.println("mno");
    }
}

class B extends Car{
    void name(){
        System.out.println("xyz");
    }
}

public class polymorphisomExample {
    public static void main(String[] args) {
        System.out.println("Main class running...");
        
        A obj = new A();
        obj.name();
        
        B obj1 = new B();
        obj1.name();
    }
}
