import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class JavaFXAppTest {
  
    @Test
    public void testComputeDivide(){
        int nummer1 = 10;
        int nummer2 = 10;
        int nummerTest = 1;
        
        assertEquals(nummerTest, new JavaFXApp().computeDivide(nummer1, nummer2));

    @Test
    void test(){
        JavaFXApp Multiply = new JavaFXApp();
        Assertions.assertEquals(6, Multiply.computeMultiply(2, 3));        
    }
}