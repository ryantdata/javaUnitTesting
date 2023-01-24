package java_gradle_build_template;

public class ArraySum {
    public int arraySum(int array[]) {
        int sum = 0;
        for (int i=0; i<array.length;i++) {
            sum = sum + array[i];
        }
        return sum;
    }
}
