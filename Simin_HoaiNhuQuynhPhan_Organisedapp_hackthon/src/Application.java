import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        Scanner scnr=new Scanner(System.in);
//        System.out.println("Please enter your task: ");
//        String taskdesc=scnr.next();
//        System.out.println("Please enter your due date: ");
//        String duedate=scnr.next();
//        System.out.println("Choose status: ");
//        boolean iscompleted= scnr.hasNextBoolean();

        Task task1=new Task("Study","24/09/2025",false,1);
        Task task2=new Task("work","10/09/2025",false,2);
        Task task3=new Task("reading","05/09/2025",false,5);

       //add task
        Planner planner=new Planner();
        planner.addTask(task1);
        planner.addTask(task2);
        planner.addTask(task3);

        System.out.println();
        for (Task task : planner.getTasks()) {
            System.out.println(task);
        } //print task list

        planner.completeTask(0);   //mark task complete

        System.out.println();
        //sorting by priority
        planner.sortByStatus();
        for (Task task : planner.getTasks()) {
            System.out.println(task);
        }
        

    }
}
