package client;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class TaskClient {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Delete Task");
            System.out.println("4. Update Task");
            System.out.println("5. Exit");
            System.out.print("Select: ");
            int choice = scanner.nextInt(); scanner.nextLine();

            String command = "";
            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Description: ");
                    String desc = scanner.nextLine();
                    command = "ADD;" + title + ";" + desc;
                    break;

                case 2:
                    command = "VIEW";
                    break;

                case 3:
                    System.out.print("Enter Task ID to delete: ");
                    int delId = scanner.nextInt(); scanner.nextLine();
                    command = "DELETE;" + delId;
                    break;

                case 4:
                    System.out.print("Enter Task ID to update: ");
                    int upId = scanner.nextInt(); scanner.nextLine();
                    System.out.print("New Title: ");
                    String newTitle = scanner.nextLine();
                    System.out.print("New Description: ");
                    String newDesc = scanner.nextLine();
                    command = "UPDATE;" + upId + ";" + newTitle + ";" + newDesc;
                    break;

                case 5:
                    System.out.println("Exiting.");
                    return;

                default:
                    System.out.println("Invalid option.");
                    continue;
            }

            try (
                Socket socket = new Socket("localhost", 8888);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
            ) {
                out.println(command);

                System.out.println("\nServer Response:");
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println(line);
                }

            } catch (IOException e) {
                System.out.println("Could not connect to server: " + e.getMessage());
            }
        }
    }
}
