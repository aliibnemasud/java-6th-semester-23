package Practice_sheet_0.Task_4;

/* 
Task 4 - Change the task variable from the main method.
*/

class SampleClass {
    private String task;

    // This is the getter method.
    public String getTask() {
        return this.task;
    }

    // This is the setter method.
    public void setTask(String task) {
        this.task = task;
    };
};

public class Main {
    public static void main(String[] main) {
        // write your code here
        SampleClass task = new SampleClass();
        task.setTask("Task Changed");
        System.out.println(task.getTask());
    };
};
