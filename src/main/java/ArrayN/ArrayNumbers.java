package ArrayN;

public class ArrayNumbers {

    public void positSum(int[] array1) {
        int sum = 0;
        for (int i = 0; i <= array1.length - 1; i++) {
            if (array1[i] >= 0) sum = sum + array1[i];
        }
        System.out.println("Sum of positive number equals: " + sum);

    }

    public void averValue(int[] array1) {
        int sum = 0;
        for (int k : array1)
            sum += k;
        System.out.println("Average value: " + (float) sum / (array1.length));
    }
}
