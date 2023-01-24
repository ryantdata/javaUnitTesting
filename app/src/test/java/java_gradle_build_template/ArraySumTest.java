package java_gradle_build_template;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArraySumTest {
    
    @Test
    public void checkArraySum() {
        ArraySum newInstance = new ArraySum();
        int array[] = {1,2,3};
        assertEquals(6, newInstance.arraySum(array));
    }
}
