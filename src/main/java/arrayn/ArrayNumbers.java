package arrayn;

public class ArrayNumbers {

    static public Integer positSum(int[] array1) {
        int sum = 0;
        for (int i = 0; i <= array1.length - 1; i++) {
            if (array1[i] >= 0) sum += array1[i];
        }
        return sum;

    }

    static public float averValue(int[] array1) {
        int sum = 0;
        for (int k : array1)
            sum += k;
        return (float) sum / (array1.length);
    }
}
