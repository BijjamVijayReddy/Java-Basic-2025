package Collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo__002 {

    public static void main (String[] args){
        ArrayList <String> userName = new ArrayList<>();
        userName.add("Prabhas");
        userName.add("Ram Charan");
        userName.add("MaheshBabu");

        System.out.println(userName);
        String  names = userName.get(0);
        System.out.println(names);
    }
}
