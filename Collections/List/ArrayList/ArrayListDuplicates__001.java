package Collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListDuplicates__001 {

    public static void main(String[] args) {

        ArrayList<Integer> duplicates = new ArrayList<>();
        duplicates.add(10);
        duplicates.add(20);
        duplicates.add(30);
        duplicates.add(30);
        duplicates.add(20);
        duplicates.add(20);
        duplicates.add(40);
        duplicates.add(40);

        System.out.println("Duplicate Values = " + duplicates);

        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < duplicates.size(); i++) {
            int currentValue = duplicates.get(i);

            if (!uniqueList.contains(currentValue)) {
                uniqueList.add(currentValue);
            }
        }

        System.out.println("Unique Values   = " + uniqueList);
    }
}
