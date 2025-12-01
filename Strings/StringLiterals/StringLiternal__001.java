package Strings.StringLiterals;

public class StringLiternal__001 {

    public static void  main (String[] args){

        String myName = "Jai";
        String  userName = "Jai";
        String personName = new String("Jai");

        System.out.println( myName == userName);
        System.out.println( userName == personName);
        System.out.println(userName.equals(personName));
    }
}
