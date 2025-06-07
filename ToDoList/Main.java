import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args){
       // create a new empty list
   HoneyDoList honeydo = new HoneyDoList();

   honeydo.addTask(new Task("Get dressed", 2, 5, LocalDateTime.of(2025, 6, 23, 8, 35)));
   honeydo.addTask(new Task("Brush teeth", 1, 5, LocalDateTime.of(2025, 6, 23, 8, 30)));
   honeydo.addTask(new Task("Do laundry", 5, 10, LocalDateTime.of(2025, 6, 23, 10, 0)));
   honeydo.addTask(new Task("Cook breakfast", 3, 20, LocalDateTime.of(2025, 6, 23, 8, 45)));
   honeydo.addTask(new Task("Eat breakfast", 4, 30, LocalDateTime.of(2025, 6, 23, 9, 15)));
   honeydo.addTask(new Task("Take aspirin", 4, 2, LocalDateTime.of(2025, 6, 23, 9, 15)));
   System.out.println(honeydo);

   System.out.println("Quickest task:\n"+ honeydo.getTask(honeydo.shortestTime()));

   }
}