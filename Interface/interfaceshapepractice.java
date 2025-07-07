package labreport;

interface shape {
    void s_shape();
}

class circle implements shape {
    public void s_shape() {
        System.out.println("The Shape is Circle: ");
    }
}

class triangle implements shape {
    public void s_shape() {
        System.out.println("The Shape is Triangle: ");
    }
}

public class interfaceshapepractice {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.s_shape();
        triangle t1 = new triangle();
        t1.s_shape();
    }
}
