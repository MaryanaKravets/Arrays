import arrayl.ArrayObject;
import arrayn.ArrayNumbers;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Integer[] array = {2, 3, 1, 7, 11};
        int[] array1 = {1, 6, -8, 4, -9};

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        List<String> listStr = new ArrayList<>();
        listStr.add("One");
        listStr.add("Two");
        listStr.add("Tree");
        listStr.add("Four");

        ArrayObject.decrSort(array);
        ArrayObject.replArray(listStr, "Tree", "Three");
        System.out.println("Sum of positive number equals: "+ ArrayNumbers.positSum(array1));
        System.out.println("Average value: " + ArrayNumbers.averValue(array1));
        ArrayObject.removeValue(list);
    }
}






