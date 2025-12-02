package ExectionHandling;

public class Throw__001 {

    public static void main (String[] args){

        int myAge = 17;

        if(myAge < 18){
            throw new ArithmeticException(" You are not englible for Vote");
        }

        System.out.println("You can Vote Now");
    }
}
