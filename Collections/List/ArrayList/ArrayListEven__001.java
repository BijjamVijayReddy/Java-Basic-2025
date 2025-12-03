package Collections.List.ArrayList;

//10, 21, 33, 40, 55, 60
// 21
//33
//55

import java.util.ArrayList;

public class ArrayListEven__001 {

    public static void main (String[] args){
        ArrayList<Integer> oddNum = new ArrayList<Integer>();
        oddNum.add(10);
        oddNum.add(21);
        oddNum.add(33);
        oddNum.add(40);
        oddNum.add(55);
        oddNum.add(60);
//        System.out.println(oddNum);

        for(int i =1;i< oddNum.size(); i++){
            int currentValue = oddNum.get(i);
//            System.out.println(currentValue);
            if(currentValue % 2 !=0){
                System.out.println(currentValue);
            }
        }

    }
}
