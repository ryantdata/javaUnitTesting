/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package java_gradle_build_template;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        CompareTriplets newInstance = new CompareTriplets();
        int[] a = {1,2,3};
        int[] b = {3,2,1};
        int[] result = newInstance.compareTriplets(a, b);
        System.out.println(Arrays.toString(result));
    }
}
