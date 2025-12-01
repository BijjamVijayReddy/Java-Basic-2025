package Polymorphism.OverLoading;

//
//multiply(2, 3);
//multiply(2.5, 4.5);
//multiply(2, 3, 4);

class Multiply  {

    void multi (int x , int y){
        System.out.println( x * y );
    }

    void multi ( double x , double y , int z){
        System.out.println(x * y+z) ;
    }

    void multi (int x ,int y, int z, int a){
        System.out.println( x * y * z * a);
    }

}


public class overLoading__Mul {

    public static  void main (String[] args){

        Multiply overLoading001 = new Multiply();
        overLoading001.multi(2,3);
        overLoading001.multi(2.5 , 4.5 ,1);
        overLoading001.multi(2,3,4,5);
    }
}
