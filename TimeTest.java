import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TimeTest {
    
    @Test
    void testIntConstructor(){
        Time t=new Time(123);
        Assertions.assertEquals(t.getHours(),2,"Wrong hours for int constructor.");
        Assertions.assertEquals(t.getMinutes(),3,"Wrong minutes for int constructor.");
    }
}
