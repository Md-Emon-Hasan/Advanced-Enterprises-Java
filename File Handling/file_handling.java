import java.io.IOException;
import java.io.File;
import java.io.*;

public class file_handling {
    public static void main(String[] args) {
       File f1 = new File("karimkhan.txt");  // class er jonno object create korlam
       
       try{
           if(f1.createNewFile()){
              System.out.println("File is created:" + f1.getName()); // Here Getname means Returns file name.
              System.out.println("The Path is :" + f1.getAbsolutePath()); // Here getAbsolutePath means Returns file’s absolute path.
           }
           else{
               System.out.println("File is already Exist");
           }
           System.out.println("File write status:" + f1.canWrite()); // file write hoica bujai
           System.out.println("File read status:" + f1.canRead());  // file read hoyca bujai
           System.out.println("File size:" + f1.length()); // file size bujai
           
           FileWriter w1 = new FileWriter(f1, true);
           w1.write("CSE Department");
           w1.close();
           
           BufferedReader read = new BufferedReader(new FileReader(f1));
           System.out.println(read.readLine());
           read.close();
       }
       catch(IOException e)
       {
           System.out.println("Error Ocured");
       }
             
    }
}
