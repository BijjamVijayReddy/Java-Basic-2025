package Polymorphism.OverLoading;


//calc.add(10, 20);
//calc.add(10, 20, 30);
//calc.add(10, 20, 30, 40);


class Cal {

    void add(int x, int y){
        System.out.println( x +y);
    }

    void add (int x,int y, int z){
        System.out.println( x + y +z);
    }

    void add (int x, int y , int z , int a){
        System.out.println(x + y + z + a);

    }
}

public class OverLoading_Cal {

    public static  void main (String[] args){
        Cal  overLoading = new Cal();
        overLoading.add(10,50);
        overLoading.add(10,20,30);
        overLoading.add(10,20,30,40);

    }
}

