import java.util.ArrayList;
import java.util.List;

public class Planner{
    List<Task> tasks=new ArrayList<>();


    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added.");
    }


    public boolean removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            return true;
        }
        return false;
    }

    public boolean completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task task = tasks.get(index);
            task.setCompleted(true);
            tasks.remove(index);  // remove completed task
            System.out.println("Task \"" + task.isCompleted()+ "\" marked as completed and removed.");
            return true;
        }
        System.out.println("Invalid task index.");
        return false;
    }


    public void sortByStatus() {
        tasks.sort((t1, t2) -> Integer.compare(t1.getPriority(), t2.getPriority()));
    }

    public List<Task> getTasks() {
        return tasks;
    }


}
