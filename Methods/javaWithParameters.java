package Methods;

class cal {

    void add(int a , int b){
        System.out.println( a+b);
    }
}

public class javaWithParameters {

    public static void main (String[] args){
         cal  data = new cal();
         data.add(1,2);
    }
}
