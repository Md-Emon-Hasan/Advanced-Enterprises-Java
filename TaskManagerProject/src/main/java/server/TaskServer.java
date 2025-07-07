package server;

import store.TaskStorage;
import java.net.*;
import java.io.*;

public class TaskServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("Task Server running on port 8888...");

        while (true) {
            Socket socket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String command = in.readLine(); // ADD;Title;Description
            String[] parts = command.split(";", 4);
            String response = "";

            switch (parts[0]) {
                case "ADD":
                    response = TaskStorage.addTask(parts[1], parts[2]);
                    break;
                case "VIEW":
                    response = TaskStorage.getAllTasks();
                    break;
                case "DELETE":
                    response = TaskStorage.deleteTask(Integer.parseInt(parts[1]));
                    break;
                case "UPDATE":
                    response = TaskStorage.updateTask(
                        Integer.parseInt(parts[1]), parts[2], parts[3]);
                    break;
                default:
                    response = "Invalid command.";
            }

            out.println(response);
            socket.close();
        }
    }
}
