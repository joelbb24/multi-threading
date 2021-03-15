

public class Main {
    private Thread t;
    private String threadName;

    Main(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running "+ threadName);

            try {
                for(int i=4; i>0; i--) {
                    System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread "+ threadName+ "interrupted.");
            }
        System.out.println("Thread" + threadName+ "exiting.");
        }

        public void start() {

    }
}