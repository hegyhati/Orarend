import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the name of the course?");
        String name = sc.next();
        System.out.println("How many hours?");
        int duration = sc.nextInt();
        Course c = new Course(name, duration);
        System.out.println("When does it start? At what hour without minutes, e.g.: 6");
        int start = sc.nextInt();
        ScheduledCourse s = new ScheduledCourse(c, start);

        System.out.println(s);
        sc.close();
    }
}
