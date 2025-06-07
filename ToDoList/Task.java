import java.time.LocalDateTime;

public class Task {

    private String name;
    private int priority;
    private int estMinsToComplete;
    private LocalDateTime whenDue;
    //constructor method
    public Task(String name, int priority, int estMinsToComplete, LocalDateTime whenDue){
        this.name = name;
        this.priority = priority;
        this.estMinsToComplete = estMinsToComplete;
        this.whenDue = whenDue;
    }
//accessor methods
    public String getName(){
        return name;
    }

    public int getPriority(){
        return priority;
    }

    public int getEstMinsToComplete(){
        return estMinsToComplete;
    }
//mutator methods
    public void setName(String newName){
        name = newName;
    }

    public void setEstMinsToComplete(int newMins){
        estMinsToComplete = newMins;
    }
//returns string representation of task
    public String toString(){
        return name + "\nPriority Rank: " + priority
        + "\nEst time to completion: " + estMinsToComplete + " minutes.";
    }

    public void increasePriority(int amount){
        if(amount > 0){
            priority += amount;
        }
        else{
            return;
        }
    }

    public void decreasePriority(int amount){
        if(amount > 0){
            priority -= amount;
            if(priority < 0){
                priority = 0;
            }
        }
        else{
            return;
        }
    }

    public boolean overdue(){
        if(LocalDateTime.now().isAfter(whenDue)){
            return true;
        }
        return false;
    }

    public static void main(String []args) {

        Task doMyHW = new Task("finish 1068 homework", 3, 120, LocalDateTime.of(2019, 3, 23, 13, 0));
        System.out.println(doMyHW);
        doMyHW.setName("start drafting 1166 project");
        doMyHW.setEstMinsToComplete(45);
        System.out.println(doMyHW);
    }

}
