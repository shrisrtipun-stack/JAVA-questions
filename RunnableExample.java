class MyTask implements Runnable {

    String taskName;

    // Constructor
    MyTask(String taskName) {
        this.taskName = taskName;
    }

    // run() method
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(taskName + " - Count: " + i);

            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted.");
            }
        }
    }
}


public class RunnableExample {

    public static void main(String[] args) {

        // Create tasks
        MyTask task1 = new MyTask("Task 1");
        MyTask task2 = new MyTask("Task 2");

        // Create threads
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Start threads
        thread1.start();
        thread2.start();
    }
}
