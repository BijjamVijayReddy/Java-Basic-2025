package Methods;


class JavaMethod {
    void withOutParameters (){
        System.out.println(" This is Without the Parameters in Method");
    }

    void withParaMeters(int x, int y){
        System.out.println(x+y);
    }

    int myAge() {
        return 26;
    }
}

public class Methods {

    public  static void main (String[] args){

        JavaMethod  obj = new JavaMethod();
        obj.withOutParameters();
        obj.withParaMeters(10,25);
        System.out.println(obj.myAge());

    }
}
