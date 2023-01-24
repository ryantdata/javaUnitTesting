package java_gradle_build_template;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class CompareTripletsTest {

    @Test
    public void checkArrayLength() {
        int[] a = {1,2,3};
        int[] b = {3,2,1};
        CompareTriplets newInstance = new CompareTriplets();
        boolean result = true;
        assertEquals(result, newInstance.arrayLength(a, b));
    }

    @Test
    public void checkCompareTriplets() {
        int a[] = {1,2,3};
        int b[] = {3,2,1};
        CompareTriplets newInstance = new CompareTriplets();
        int[] result = {1,1};

        assertEquals(Arrays.toString(result), Arrays.toString(newInstance.compareTriplets(a, b)));
    }
}
