class Task {
    int taskId;
    String taskName;
    String status;
    Task next;

    Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    public String toString() {
        return taskId + " " + taskName + " [" + status + "]";
    }
}

public class TaskManager {
    static Task head = null;

    static void addTask(int taskId, String taskName, String status) {
        Task newTask = new Task(taskId, taskName, status);
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newTask;
        }
    }

    static Task searchTask(int taskId) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == taskId) return temp;
            temp = temp.next;
        }
        return null;
    }

    static void deleteTask(int taskId) {
        if (head == null) return;
        if (head.taskId == taskId) {
            head = head.next;
            return;
        }
        Task prev = null, curr = head;
        while (curr != null && curr.taskId != taskId) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) prev.next = curr.next;
    }

    static void traverseTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        addTask(1, "Design UI", "Pending");
        addTask(2, "Develop Backend", "In Progress");
        addTask(3, "Testing", "Not Started");

        System.out.println("All Tasks:");
        traverseTasks();

        System.out.println("\nSearch Task ID 2:");
        System.out.println(searchTask(2));

        System.out.println("\nAfter Deleting Task ID 2:");
        deleteTask(2);
        traverseTasks();
    }
}
