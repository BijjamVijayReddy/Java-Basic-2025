package JavaObjects_001;

 class  myDeatils {
    String myName;
    int age;

}

public class JavaObjectBasic_001 {

    public static  void main (String[] args){

         myDeatils user = new myDeatils();

         user.myName = "Vijay";
         user.age = 26;

         System.out.println(user.myName);
         System.out.println(user.age);
    }
}
