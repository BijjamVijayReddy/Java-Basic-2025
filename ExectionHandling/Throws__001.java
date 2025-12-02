package ExectionHandling;

public class Throws__001 {

    static void myAge(int userAge) throws ArithmeticException {
        if(userAge < 18){
            throw new ArithmeticException("You not Eligible for Vote");
        }
        System.out.println("You can Vote when Elections are there");
    }

    public static void main (String[] args){
        myAge(20);
    }
}
