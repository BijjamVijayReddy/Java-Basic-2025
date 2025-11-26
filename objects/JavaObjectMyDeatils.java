package objects;

// object in Java;

class myDetails {
     String myName;
     String myNative ;
     long myNumber ;
     double myHeight;

     void myName(){
         System.out.println(" My Name is Jai");
     }

}

public class JavaObjectMyDeatils {

   public static  void main (String[] args){
        myDetails userData =new  myDetails();
        userData.myName = "Vijay";
        userData.myNative = "Buchi Reddy Palam,Nellore,Andhra Pradesh";
        userData.myNumber = 9491467216l;
        userData.myHeight = 5.8;

       userData.myName();
        System.out.println(userData.myNative);
   }
}
