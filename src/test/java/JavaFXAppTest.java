import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

class JavaFXAppTest {
    @Test
    void aDummyTest() {
        assertEquals(0,0);
    }
    
    @Test
    void testComputeDivide(){       
        Assertions.assertEquals(1, new DevideCompute().compute(1, 1));
    }

    @Test
    void testComputeMultiply(){
        Assertions.assertEquals(6, new MultiplyCompute().compute(2, 3));        
    }  

    @Test
    void testComputeAdd(){
        Assertions.assertEquals(3, new PlusCompute().compute(1, 2));
    }
}