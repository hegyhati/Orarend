import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Assertions;

public class TimeTest {
    
    @Test
    @DisplayName("Test for int constructor")
    void testIntConstructor(){
        Time t=new Time(123);
        Assertions.assertEquals(2,t.getHours(),"Wrong hours for int constructor.");
        Assertions.assertEquals(3,t.getMinutes(),"Wrong minutes for int constructor.");
    }

    @Test
    @DisplayName("Test for int,int constructor")
    void testIntIntConstructor(){
        Time t=new Time(4,20);
        Assertions.assertEquals(4,t.getHours(),"Wrong hours for int constructor.");
        Assertions.assertEquals(20,t.getMinutes(),"Wrong minutes for int constructor.");
    }

    @ParameterizedTest
    @ValueSource( ints = {123,45,12343,567,6783,234,1234,345,67,1,2,3,4,5,6,7} )
    void testIntConstructorParam(int min){
        Time t=new Time(min);
        Assertions.assertEquals(min/60,t.getHours(),"Wrong hours for int constructor.");
        Assertions.assertEquals(min%60,t.getMinutes(),"Wrong minutes for int constructor.");
    }

    @Test
    void testIsBeforeNoon(){
        assertAll( "foobar",
            () -> {final Time t = new Time (11,15); Assertions.assertTrue(t.isBeforeNoon(), "Fancy error message");},
            () -> {final Time t = new Time (1,15); Assertions.assertTrue(t.isBeforeNoon(), "Fancy error message");},
            () -> {final Time t = new Time (12,15); Assertions.assertFalse(t.isBeforeNoon(), "Fancy error message");},
            () -> {final Time t = new Time (12,00); Assertions.assertFalse(t.isBeforeNoon(), "Fancy error message");}
        );
    }
}
