package ArrayL;

import java.util.*;

public class ArrayObject {


    public void decrSort(Integer[] array) {
        List<Integer> list1 = Arrays.asList(array);
        Collections.sort(list1, Comparator.reverseOrder());
        list1.toArray();
        System.out.println("Array ordered by decreasing: " + list1);
        System.out.println();

    }

    public void replArray(ArrayList<String> listStr, String str1, String str2) {

        for (String st : listStr) {
            if (st.equals(str1)) {
                int i = listStr.indexOf(st);
                listStr.set(i, str2);
            }
        }

        System.out.println("ArrayList String after replacing: ");
        for (String st : listStr)
            System.out.println(st);
        System.out.println();

    }

    public void removeValue(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value % 3 == 0)
                iterator.remove();
        }
        System.out.println("ArrayList after removing: " + list);
    }
}
