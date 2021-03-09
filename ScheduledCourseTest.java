
public class ScheduledCourseTest {
    public static void main(String [] args){
        testOverlap();
        testtGetEnd();
    }

    public static void assertEqual(Object generated, Object expected, String errorMessage){
        if(!generated.equals(expected)) {
            System.out.println(errorMessage);
            System.exit(1);
        } else {
            System.out.println("OK");
        }
    }

    private static void testtGetEnd() {
        System.out.println("GETEND TEST");
        ScheduledCourse sc1=new ScheduledCourse("SZTA",4,8);
        assertEqual(sc1.getEnd(), 12, "Hibas getEnd");
    }

    private static void testOverlap() {
        System.out.println("OVERLAP TEST");
        ScheduledCourse sc1=new ScheduledCourse("SZTA",4,8);
        ScheduledCourse sc2=new ScheduledCourse("FoNyA",4,10);
        assertEqual(sc1.overlapsWith(sc1), true, "Hibas overlap");
        assertEqual(sc1.overlapsWith(sc2), true, "Hibas overlap");
        assertEqual(sc2.overlapsWith(sc1), true, "Hibas overlap");
        assertEqual(sc2.overlapsWith(sc2), true, "Hibas overlap");
    }
}
