class Task {
    int taskId;
    String taskName;
    String status;

    Task next;

    public Task(int id, String name, String status) {
        this.taskId = id;
        this.taskName = name;
        this.status = status;
        this.next = null;
    }

    public String toString() {
        return taskId + " - " + taskName + " [" + status + "]";
    }
}

class TaskManager {
    Task head;

    public void addTask(Task newTask) {
        if (head == null) {
            head = newTask;
        } else {
            Task temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newTask;
        }
    }

    public void deleteTask(int id) {
        if (head == null) return;
        if (head.taskId == id) {
            head = head.next;
            return;
        }
        Task prev = null, curr = head;
        while (curr != null && curr.taskId != id) {
            prev = curr;
            curr = curr.next;
        }
        if (curr != null) prev.next = curr.next;
    }

    public Task searchTask(int id) {
        Task temp = head;
        while (temp != null) {
            if (temp.taskId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void printTasks() {
        Task temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }
}

public class Main5 {
    public static void main(String[] args) {
        TaskManager tm = new TaskManager();
        tm.addTask(new Task(1, "Design UI", "Pending"));
        tm.addTask(new Task(2, "Implement Backend", "In Progress"));
        tm.deleteTask(1);
        tm.printTasks();
    }
}

