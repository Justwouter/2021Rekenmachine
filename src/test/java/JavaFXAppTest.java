import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }
    
    @Test
    void addTest(){
        Assertions.assertEquals(3, new JavaFXApp().computeAdd(1, 2));
    }
}