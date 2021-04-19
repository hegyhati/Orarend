package orarend;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String name = sc.next();
        int duration = sc.nextInt();
        Course c = new Course(name, duration);
        int start = sc.nextInt();
        ScheduledCourse s = new ScheduledCourse(c, start);

        name = sc.next();
        duration = sc.nextInt();
        Course c2 = new Course(name, duration);
        start = sc.nextInt();
        ScheduledCourse s2 = new ScheduledCourse(c2, start);

        
        if(s.overlapsWith(s2)){
            System.out.println("They overlap.");
        } else {
            System.out.println("They don't overlap.");
        }



        sc.close();
    }
}
