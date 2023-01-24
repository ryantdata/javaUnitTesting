package java_gradle_build_template;

import org.junit.Test;
import static org.junit.Assert.*;

public class BigSumTest {
    
    @Test
    public void checkBigSum() {
        int a = 2000000000;
        int b = 2100100100;
        BigSum newInstance = new BigSum();
        long result = 4100100100L;
        assertEquals(result, newInstance.bigSum(a, b));
    }
}
