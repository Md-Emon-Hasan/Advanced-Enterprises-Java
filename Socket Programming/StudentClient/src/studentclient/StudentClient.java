package studentclient;
import java.io.*;
import java.net.*;
import java.util.*;

public class StudentClient {
    public static void main(String[] args) throws IOException {
        Socket cs = new Socket("localhost", 5000);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(cs.getOutputStream(), true);
        System.out.println("Enter Your Name: ");
        String name = in.readLine();
        out.println(name);
        cs.close();
    }
}