package Collections.List.ArrayList;
//10, 20, 30, 40, 50;
//All elements
//Size of list
//Remove element at index 2
//Print list again

import java.util.ArrayList;

public class ArrayList__004 {

    public static void main (String[] args){
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);

        System.out.println(num);
        int totalNum = num.size();
         int unWantedNum = num.remove(2);
         System.out.println("Number After Index Removing" + num);

        System.out.println(totalNum);

    }
}
