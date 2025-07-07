package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class SwingTaskClient extends JFrame {

    private JTextArea outputArea;

    public SwingTaskClient() {
        setTitle("🧠 Task Manager (Swing UI)");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Button Panel
        JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
        JButton addButton = new JButton("Add Task");
        JButton viewButton = new JButton("View Tasks");
        JButton deleteButton = new JButton("Delete Task");
        JButton updateButton = new JButton("Update Task");
        buttonPanel.add(addButton);
        buttonPanel.add(viewButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(updateButton);
        add(buttonPanel, BorderLayout.NORTH);

        // Output Panel
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        // Button Actions
        addButton.addActionListener(e -> handleAdd());
        viewButton.addActionListener(e -> sendCommand("VIEW"));
        deleteButton.addActionListener(e -> handleDelete());
        updateButton.addActionListener(e -> handleUpdate());
    }

    private void handleAdd() {
        String title = JOptionPane.showInputDialog(this, "Enter Task Title:");
        if (title == null || title.isEmpty()) return;

        String desc = JOptionPane.showInputDialog(this, "Enter Task Description:");
        if (desc == null || desc.isEmpty()) return;

        sendCommand("ADD;" + title + ";" + desc);
    }

    private void handleDelete() {
        String idStr = JOptionPane.showInputDialog(this, "Enter Task ID to delete:");
        if (idStr == null || idStr.isEmpty()) return;

        sendCommand("DELETE;" + idStr);
    }

    private void handleUpdate() {
        String idStr = JOptionPane.showInputDialog(this, "Enter Task ID to update:");
        if (idStr == null || idStr.isEmpty()) return;

        String newTitle = JOptionPane.showInputDialog(this, "Enter New Title:");
        if (newTitle == null || newTitle.isEmpty()) return;

        String newDesc = JOptionPane.showInputDialog(this, "Enter New Description:");
        if (newDesc == null || newDesc.isEmpty()) return;

        sendCommand("UPDATE;" + idStr + ";" + newTitle + ";" + newDesc);
    }

    private void sendCommand(String command) {
        try (
            Socket socket = new Socket("localhost", 8888);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            out.println(command);
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line).append("\n");
            }
            outputArea.setText(response.toString());
        } catch (IOException ex) {
            outputArea.setText("Server error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SwingTaskClient().setVisible(true));
    }
}
