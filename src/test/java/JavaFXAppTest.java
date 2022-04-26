import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }
    
    public void testComputeDivide(){
        int nummer1 = 10;
        int nummer2 = 10;
        int nummerTest = 1;
        
        assertEquals(nummerTest, new JavaFXApp().computeDivide(nummer1, nummer2));
    }
}