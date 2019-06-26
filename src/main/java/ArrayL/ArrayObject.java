package ArrayL;

import java.util.*;

public class ArrayObject {


    public void decrSort(Integer[] array) {
        List<Integer> list1 = Arrays.asList(array);
        Collections.sort(list1, Comparator.reverseOrder());
        System.out.println("List ordered by decreasing: " + list1);
        System.out.println();

    }

    public void replArray() {
        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("One");
        listStr.add("Two");
        listStr.add("Tree");
        listStr.add("Four");

        int i = listStr.indexOf("Tree");
        listStr.set(i, "Three");
        System.out.println("ArrayList String after replacing: ");
        for (String st : listStr)
            System.out.println(st);
        System.out.println();

    }

    public void removeValue() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(9);
        list.add(11);
        list.add(18);
        list.add(20);
        list.add(22);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            if (value % 3 == 0)
                iterator.remove();
        }
        System.out.println("ArrayList after removing: " + list);
    }
}
