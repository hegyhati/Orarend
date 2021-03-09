
public class ScheduledCourseMyTest {
    static ScheduledCourse sc1;
    static ScheduledCourse sc2;

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

    static void setup(){
        sc1=new ScheduledCourse("SZTA",4,8);
        sc2=new ScheduledCourse("FoNyA",4,10);
    }

    private static void testtGetEnd() {
        System.out.println("GETEND TEST");
        setup();
        ScheduledCourse sc1=new ScheduledCourse("SZTA",4,8);
        assertEqual(sc1.getEnd(), 12, "Hibas getEnd");
        assertEqual(sc2.getEnd(), 14, "Hibas getEnd");
    }

    private static void testOverlap() {
        System.out.println("OVERLAP TEST");
        setup();
        assertEqual(sc1.overlapsWith(sc1), true, "Hibas overlap");
        assertEqual(sc1.overlapsWith(sc2), true, "Hibas overlap");
        assertEqual(sc2.overlapsWith(sc1), true, "Hibas overlap");
        assertEqual(sc2.overlapsWith(sc2), true, "Hibas overlap");
    }
}
