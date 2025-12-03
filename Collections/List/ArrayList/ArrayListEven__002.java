package Collections.List.ArrayList;
//Duplicate Values = [10, 20, 30, 30, 20, 20, 40, 40]
//Unique Values   = [10, 20, 30, 40]

import java.util.ArrayList;

public class ArrayListEven__002 {

    public static void main (String[] args){

        ArrayList <Integer> evenNum = new ArrayList<>();
        evenNum.add(10);
        evenNum.add(20);
        evenNum.add(30);
        evenNum.add(40);

        System.out.println(evenNum);

        for(int i = 0;i< evenNum.size();i++){
            int num = evenNum.get(i);
//            System.out.println(num);

            if(num % 2 == 0){
                System.out.println(num);
            }
        }
    }
}
