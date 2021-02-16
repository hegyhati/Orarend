import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mi a targy neve?");
        String name = sc.next();
        System.out.println("Hany oras aa targy?");
        int duration = sc.nextInt();
        Course c = new Course(name, duration);
        System.out.println("Mikor kezdodjon az ora?");
        int start = sc.nextInt();
        ScheduledCourse s = new ScheduledCourse(c, start);

        System.out.println(s);
        sc.close();
    }
}
