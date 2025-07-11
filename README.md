## 📘 Project Title

**Java Task Manager System Using Swing UI, Socket Programming, and Java Collections**

<img alt="Image" src="https://github.com/user-attachments/assets/fef15a9a-e627-4ce9-91a2-bcfbe9822964" />

---

## 🎯 Objective

The goal of this project is to build a modular, interactive task management application using **core Java**, that supports basic **CRUD operations** (Create, Read, Update, Delete) with:

* **Client-Server architecture**
* **Graphical User Interface using Swing**
* **HashMap-based task storage (in-memory)**
* Demonstration of **OOP principles** in action

---

## 🧑‍💻 Technologies & Tools Used

| Technology / Tool             | Purpose / Use                                |
| ----------------------------- | -------------------------------------------- |
| Java SE                       | Core language for entire application         |
| Swing                         | Building the graphical user interface        |
| Java Sockets                  | Enabling client-server communication         |
| HashMap (Collection)          | Storing and managing tasks in memory         |
| BufferedReader / Writer       | Reading and writing messages over the socket |
| NetBeans / IntelliJ / VS Code | IDEs for development                         |
| Command Line                  | Running server and client separately         |

---

## 🏗️ System Architecture

```
          +---------------------+                 +-------------------------+
          |   Swing UI Client   | <---Socket----> |      Task Server        |
          | (TaskClient.java)   |                 | (TaskServer.java)       |
          +---------------------+                 +-------------------------+
                     |                                         |
                     |   send/receive task commands (String)   |
                     |---------------------------------------->|
                     |<----------------------------------------|
                     |
          +--------------------------------------------------------------+
          |                In-Memory Task Storage (HashMap)              |
          |          (via TaskStorage.java using Map<Integer, Task>)     |
          +--------------------------------------------------------------+
```

---

## 🧩 Project Structure

```
JavaTaskManager/
├── model/
│   └── Task.java              # Task object model (id, title, description)
├── store/
│   └── TaskStorage.java       # Task management using HashMap
├── server/
│   └── TaskServer.java        # Listens for client connections and executes commands
├── client/
│   └── SwingTaskClient.java   # GUI client to interact with server
└── README.md / Documentation
```

---

## ⚙️ Functional Overview

| Feature        | Description                                                 |
| -------------- | ----------------------------------------------------------- |
| Add Task       | Adds a new task with auto-incremented ID                    |
| View All Tasks | Displays all current tasks                                  |
| Update Task    | Edits title and description using task ID                   |
| Delete Task    | Deletes task by ID                                          |
| GUI Interface  | Clean Swing UI for user interaction                         |
| Server         | Console-based server runs separately and processes requests |
| Storage        | Tasks stored in a `HashMap<Integer, Task>` object           |

---

## 🧠 OOP Concepts Applied

| Concept                      | Description                                                                      |
| ---------------------------- | -------------------------------------------------------------------------------- |
| **Class**                    | Each component is modeled as a class (e.g., `Task`, `TaskStorage`, `TaskServer`) |
| **Object**                   | Task is instantiated as objects from the `Task` class                            |
| **Encapsulation**            | Fields are `private`, accessed via getters and setters                           |
| **Abstraction**              | Logic hidden inside `TaskStorage` with methods like `addTask`, `updateTask`      |
| **Modularity**               | Clean separation of GUI, server, logic, and data model                           |
| **Constructor & Overriding** | Task constructor and `toString()` method override                                |

---

## ✅ How to Run

1. **Compile All Classes**

   * Use IDE or run:

     ```bash
     javac */*.java
     ```

2. **Start the Server First**

   ```bash
   java server.TaskServer
   ```

3. **Start the Swing GUI Client**

   ```bash
   java client.SwingTaskClient
   ```

4. **Interact Using GUI:**

   * Add Task → title + description
   * Update Task → task ID + new title + new description
   * Delete Task → task ID
   * View Tasks → all tasks

---

## 📍 Use Case Scenario

* 🎓 **Academic Projects**: For learning GUI, Sockets, and OOP
* 💻 **Standalone Desktop App**: Can run without the internet or external DB
* 🧱 **Foundation App**: Can be extended to file-based or DB-based persistent task manager

---

## 🔮 Future Enhancements

* ☁️ Switch to persistent storage (File or JDBC database)
* 👤 Multi-user support with login system
* 🌐 RESTful API using Spring Boot for web UI or mobile apps
* 📅 Add deadline, category, tags, priority features
* 📦 Export/Import tasks via CSV/JSON

---

## 🧑‍💼 Author Information

**Md Emon Hasan**

* 📧 Email: [iconicemon01@gmail.com](mailto:iconicemon01@gmail.com)
* 🌐 GitHub: [Md-Emon-Hasan](https://github.com/Md-Emon-Hasan)
* 💼 LinkedIn: [Md Emon Hasan](https://www.linkedin.com/in/md-emon-hasan-695483237/)
* 📱 WhatsApp: [+8801834363533](https://wa.me/8801834363533)
* 📘 Facebook: [Md Emon Hasan](https://www.facebook.com/mdemon.hasan2001/)

---
