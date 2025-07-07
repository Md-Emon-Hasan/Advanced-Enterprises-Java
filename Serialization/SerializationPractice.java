package labreport;
import java.io.*;
class person implements Serializable {
    public static final long serialVersionUID = 1L;
    String name;
    int id;
    transient String password;
    public person(String s, int i, String p) {
        name = s;
        id = i;
        password = p;
        System.out.println("Default Constructor");
    }
    public void display() {
        System.out.println(name + "/n" + id + "/n" + password);
    }
}
public class SerializationPractice {
    public static void main(String[] args) {
        person p1 = new person("Emon Hasan", 1079, "PASSWORD DIMO NA");
        p1.display();
        try {
            FileOutputStream fo = new FileOutputStream("pesron.ser");
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeObject(p1);
            os.close();
            fo.close();
            System.out.println("Object is Serialized");

            FileInputStream fi = new FileInputStream("Pesron.ser");
            ObjectInputStream os2 = new ObjectInputStream(fi);
            person dp = (person) os2.readObject();
            os2.close();
            fi.close();
            System.out.println("Object is Deserialized");
            dp.display();
        } catch (Exception e) {
            System.out.println("An Error Ocurred");
            e.printStackTrace();
        }
    }
}
