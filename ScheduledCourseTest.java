import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class ScheduledCourseTest {
    static ScheduledCourse sc1;
    static ScheduledCourse sc2;

    @BeforeEach
    void setup(){
        sc1=new ScheduledCourse("SZTA",4,8);
        sc2=new ScheduledCourse("FoNyA",4,10);
    }

    @Test
    @DisplayName("getEnd() test")
    void testtGetEnd() {
        assertEquals(12, sc1.getEnd(), "Hibas getEnd");
        assertEquals(14, sc2.getEnd(), "Hibas getEnd");
    }

    @Test
    @DisplayName("overlapsWidth(ScheduledCourse) test")
    void testOverlap() {
        assertEquals(true, sc1.overlapsWith(sc1), "Hibas overlap");
        assertEquals(true, sc1.overlapsWith(sc2), "Hibas overlap");
        assertEquals(true, sc2.overlapsWith(sc1), "Hibas overlap");
        assertEquals(true, sc2.overlapsWith(sc2), "Hibas overlap");
    }   
}
