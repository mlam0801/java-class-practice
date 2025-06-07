
public class HoneyDoList {
    public static final int INITIAL_CAPACITY = 10;
    
    private Task[] tasks;
    private int numTasks;

    public HoneyDoList(){
        numTasks = 0;
        tasks = new Task[INITIAL_CAPACITY];
    }

    public String toString(){
        String result="";
        for(int i = 0; i < INITIAL_CAPACITY; i++){
            if(!(tasks[i] == null)){
               result += tasks[i].toString() + "\n";
            }
        }
        return result;
    }

    public int find(String name){
        for(int i = 0; i < INITIAL_CAPACITY; i++){
            if(name.equalsIgnoreCase(tasks[i].getName())){
                return i;
            }
        }
        return -1;
    }

    public void addTask(Task task){
        if(numTasks < INITIAL_CAPACITY){
            this.tasks[numTasks] = task;
            numTasks++;
        }
        else if(numTasks >= INITIAL_CAPACITY){
            Task[] newtask = new Task[numTasks];
            for (int i=0;i < numTasks - 1;i++){
                newtask[i]=tasks[i];
            }
            newtask[numTasks-1] = task;
        }
    }

    public int totalTime(){
        int totalTime = 0;
        for(int i = 0; i < numTasks; i++){
            totalTime += tasks[i].getEstMinsToComplete(); 
        }
        return totalTime;
    }
    
    public int shortestTime(){
        int shortestTime = 0;
        if(tasks != null){
            for(int i = 0; i < numTasks; i++){
                if (tasks[i].getEstMinsToComplete() < tasks[shortestTime].getEstMinsToComplete()){
                shortestTime=i;
                }
            }
            return shortestTime;
        }
        return -1;
    }

    public Task[] completeTask(int index){
        if(index < 0 || index > numTasks - 1){
            return null;
        }
        for(int i = index; i < numTasks; i++){
            tasks[i] = tasks[i+1];
        }
        return tasks;
    }

    public Task getTask(int index){
        if(tasks[index] == null){
            return null;
        }
        return tasks[index];
    }

    public Task[] overdueTasks(){
        Task[] ODTasks = new Task[INITIAL_CAPACITY];
        int counter=0;
        for(int i = 0; i < numTasks; i++){
            if(tasks[i].overdue() == true){
                ODTasks[counter]=tasks[i];
                counter++;
            }
        }
        return ODTasks;
    }
}