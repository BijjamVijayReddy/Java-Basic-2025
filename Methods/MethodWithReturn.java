package Methods;

class myAge {

    int myDeatils (){
        return 26;
    }

}

public class MethodWithReturn {

    public static void main (String[] args){
         myAge Data = new myAge();

         System.out.println(Data.myDeatils());
    }
}
