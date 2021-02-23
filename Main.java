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

        System.out.print("Name? ");
        name = sc.next();
        System.out.print("Duration? ");
        duration = sc.nextInt();
        Course c2 = new Course(name, duration);
        System.out.print("Start? ");
        start = sc.nextInt();
        ScheduledCourse s2 = new ScheduledCourse(c2, start);

        
        System.out.println(s);
        System.out.println(s2);

        if(s.overlapsWith(s2)){
            System.out.println("They overlap.");
        } else {
            System.out.println("They don't overlap.");
        }



        sc.close();
    }
}
