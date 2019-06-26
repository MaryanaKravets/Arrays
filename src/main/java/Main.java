import ArrayL.ArrayObject;
import ArrayN.ArrayNumbers;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {2, 3, 1, 7, 11};
        int[] array1 = {1, 6, -8, 4, -9};
        ArrayObject ao = new ArrayObject();
        ArrayNumbers an = new ArrayNumbers();
        ao.decrSort(array);
        ao.replArray();
        an.positSum(array1);
        an.averValue(array1);
        ao.removeValue();
    }
}






