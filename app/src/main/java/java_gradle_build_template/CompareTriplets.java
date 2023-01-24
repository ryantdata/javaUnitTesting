package java_gradle_build_template;


public class CompareTriplets {

    public boolean arrayLength(int[] a, int[] b) {
        boolean sameLength;
        if (a.length == b.length) { sameLength = true; }
        else { sameLength = false; }
        return sameLength;
    }

    public int[] compareTriplets(int a[], int b[]) {
        if (!arrayLength(a, b)) { throw new IllegalArgumentException("The input is not valid. Input arrays must be the same length!"); }
        int score[] = {0,0};
        for (int i=0; i<a.length; i++) {
            if (a[i] < b[i]) { score[0]++; }
            if (a[i] > b[i]) { score[1]++; }
        }
        return score;
    }
}
