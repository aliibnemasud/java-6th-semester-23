package Practice_sheet_0.Task_1;

public class Main {
    public static void main(String[] main) {
        SampleClass task = new SampleClass();       
        task.setTask("Siyam");

        // write your code here
        System.out.println(task.getTask());
    };
};

class SampleClass {    
    private String task;
    public String getTask() {
        return this.task;
    }
    public void setTask(String task) {
        this.task = task;
    };
};

