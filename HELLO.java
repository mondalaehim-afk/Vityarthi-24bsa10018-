import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDate;
import java.util.*;
import java.io.*;
public class HELLO {

    public class Task implements Serializable {
        private int id;
        private String description;
        private LocalDate dueDate;
        private String priority;
        private boolean isCompleted;

        // Constructors, getters, setters, and toString
        // ...
    }

    public class TaskManager {
        private List<Task> tasks;
        private Scanner sc;

        public TaskManager() {
            // Load tasks from file or initialize
        }

        public void showMenu() {
            // Show menu and handle user input
        }

        // Methods: addTask, viewTasks, updateTask, removeTask, markCompleted, saveTasks, loadTasks
        // ...

        public static void main(String[] args) {
            TaskManager tm = new TaskManager();
            tm.showMenu();
        }
    }
}