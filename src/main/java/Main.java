import ArrayL.ArrayObject;
import ArrayN.ArrayNumbers;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {2, 3, 1, 7, 11};
        int[] array1 = {1, 6, -8, 4, -9};
        ArrayObject ao = new ArrayObject();
        ArrayNumbers an = new ArrayNumbers();

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("One");
        listStr.add("Two");
        listStr.add("Tree");
        listStr.add("Four");

        ao.decrSort(array);
        ao.replArray(listStr, "Tree", "Three");
        an.positSum(array1);
        an.averValue(array1);
        ao.removeValue(list);
    }
}






