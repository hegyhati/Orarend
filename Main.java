import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name? ");
        String name = sc.next();
        System.out.print("Duration? ");
        int duration = sc.nextInt();
        Course c = new Course(name, duration);
        System.out.print("Start? ");

        int start = sc.nextInt();
        ScheduledCourse s = new ScheduledCourse(c, start);

        System.out.println(s);
        sc.close();
    }
}
