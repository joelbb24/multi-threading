import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLearning {
    public static void main(String[] args) {
        Employee employee = new Employee();
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(()->{
            System.out.println(Thread.currentThread().getName());
            employee.setName("Atin");
            System.out.println(employee.getName());
        });

        executorService.execute(()->{
            System.out.println(Thread.currentThread().getName());
            employee.setName("Joel");
            System.out.println(employee.getName());
        });

        executorService.execute(()->{
            System.out.println(Thread.currentThread().getName());
            employee.setName("Bob");
            System.out.println(employee.getName());
        });

        executorService.execute(()->{
            System.out.println(Thread.currentThread().getName());
            employee.setName("Vivek");
            System.out.println(employee.getName());
        });

        executorService.shutdown();
    }
}


class Employee {
    private String name="";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}