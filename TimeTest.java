import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
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
}
