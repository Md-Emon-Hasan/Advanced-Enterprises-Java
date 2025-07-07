package studentserver;

import java.io.*;
import java.net.*;

public class StudentServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server is Waiting.....");
        Socket cs = ss.accept();
        System.out.println("Server is Connected to client");
        BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
        String name = in.readLine();
        System.out.println("Receive Name: " + name);
        cs.close();
        ss.close();
    }
}