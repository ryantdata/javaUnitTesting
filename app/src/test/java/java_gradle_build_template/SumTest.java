package java_gradle_build_template;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumTest {
    
    @Test 
    public void checkAddition() {
        Sum sumInstance = new Sum();
        assertEquals(5, sumInstance.addition(2, 3));
    }
}
