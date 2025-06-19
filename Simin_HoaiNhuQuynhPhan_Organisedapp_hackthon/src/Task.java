public class Task {
    private String Description;
    private String Duedate;
    private boolean isCompleted;
    private int priority;

    public String getDescription() {

        return Description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDescription(String description)
    {
        Description = description;
    }

    public String getDuedate() {

        return Duedate;
    }

    public void setDuedate(String duedate) {

        Duedate = duedate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean iscompleted) {
        isCompleted = iscompleted;
    }

    public Task(String description, String duedate, boolean isCompleted,int priority) {
        Description = description;
        Duedate = duedate;
        this.isCompleted = isCompleted;
        this.priority=priority;
    }

    @Override
    public String toString(){
        return "Daily task: "+this.getDescription()+" \nDueDate: "+this.getDuedate()+"  Completed?: "+this.isCompleted +" priority rank: "+this.getPriority();
    }
}
