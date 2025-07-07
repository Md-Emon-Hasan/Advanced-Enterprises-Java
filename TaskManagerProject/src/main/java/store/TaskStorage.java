package store;

import model.Task;
import java.util.*;

public class TaskStorage {
    private static Map<Integer, Task> taskMap = new HashMap<>();
    private static int currentId = 1;

    public static String addTask(String title, String desc) {
        Task task = new Task(currentId, title, desc);
        taskMap.put(currentId++, task);
        return "Task added: " + task.toString();
    }

    public static String getAllTasks() {
        if (taskMap.isEmpty()) return "No tasks found.";
        StringBuilder sb = new StringBuilder("All Tasks:\n");
        for (Task t : taskMap.values()) {
            sb.append(t).append("\n");
        }
        return sb.toString();
    }

    public static String deleteTask(int id) {
        if (taskMap.containsKey(id)) {
            taskMap.remove(id);
            return "Task #" + id + " deleted.";
        }
        return "Task not found.";
    }

    public static String updateTask(int id, String newTitle, String newDesc) {
        Task task = taskMap.get(id);
        if (task != null) {
            task.setTitle(newTitle);
            task.setDescription(newDesc);
            return "Task #" + id + " updated.";
        }
        return "Task not found.";
    }
}
