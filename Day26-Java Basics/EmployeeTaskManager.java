import java.util.HashMap;
import java.util.Map;

// -------------------- ENUMS --------------------

enum Role {
    DEVELOPER,
    TESTER,
    MANAGER,
    HR,
    DEVOPS
}

enum Status {
    PENDING,
    PROCESSING,
    COMPLETED
}

// -------------------- GENERIC CLASS --------------------

class TaskManager<T> {

    private HashMap<Integer, T> employees = new HashMap<>();

    public void add(int id, T employee) {
        employees.put(id, employee);
    }

    public T get(int id) {
        return employees.get(id);
    }

    public boolean contains(int id) {
        return employees.containsKey(id);
    }

    public void displayAll() {
        for (Map.Entry<Integer, T> entry : employees.entrySet()) {
            System.out.println("ID: " + entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("----------------------");
        }
    }

    public HashMap<Integer, T> getEmployees() {
        return employees;
    }
}

// -------------------- EMPLOYEE CLASS --------------------

class Employee {

    private int id;
    private String name;
    private Role role;
    private Status status;

    public Employee(int id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.status = Status.PENDING;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public synchronized void processTask() {

        System.out.println(
                Thread.currentThread().getName()
                + " processing " + name
        );

        status = Status.PROCESSING;

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println(name + " task was interrupted");
            Thread.currentThread().interrupt();
            return;
        }

        status = Status.COMPLETED;

        System.out.println(
                name + " task completed!"
        );
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Name: " + name
                + "\nRole: " + role
                + "\nStatus: " + status;
    }
}

// -------------------- MAIN CLASS --------------------

public class EmployeeTaskManager {

    public static void main(String[] args) {

        // Generic class using Employee as the type
        TaskManager<Employee> manager = new TaskManager<>();

        // Adding employees to HashMap
        manager.add(
                101,
                new Employee(101, "Janavi", Role.DEVELOPER)
        );

        manager.add(
                102,
                new Employee(102, "Sneha", Role.TESTER)
        );

        manager.add(
                103,
                new Employee(103, "Rahul", Role.MANAGER)
        );

        manager.add(
                104,
                new Employee(104, "Priya", Role.HR)
        );

        manager.add(
                105,
                new Employee(105, "Pal", Role.DEVOPS)
        );

        // Display employees
        System.out.println("===== EMPLOYEES =====");
        manager.displayAll();

        // ---------------- THREADS ----------------

        Employee e1 = manager.get(101);
        Employee e2 = manager.get(102);
        Employee e3 = manager.get(103);
        Employee e4 = manager.get(104);
        Employee e5 = manager.get(105);

        Runnable task1 = () -> e1.processTask();
        Runnable task2 = () -> e2.processTask();
        Runnable task3 = () -> e3.processTask();
        Runnable task4 = () -> e4.processTask();
        Runnable task5 = () -> e5.processTask();

        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");
        Thread thread3 = new Thread(task3, "Thread-3");
        Thread thread4 = new Thread(task4, "Thread-4");
        Thread thread5 = new Thread(task5, "Thread-5");
        System.out.println("\n===== PROCESSING TASKS =====");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
            Thread.currentThread().interrupt();
        }

        // ---------------- FINAL STATUS ----------------

        System.out.println("\n===== FINAL STATUS =====");

        manager.displayAll();
    }
}