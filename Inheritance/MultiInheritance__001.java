package Inheritance;

 class GrandFather{
     void grandFatherProperty(){
         System.out.println("GrandFather has 100Acres");
     }
 }

 class isFather extends  GrandFather{
     void fatherProperty() {
         System.out.println(" Father Revived 30 Acres");
     }
 }

 class isSon extends isFather{
     void SonProperty(){
         System.out.println("Son is Recived 7 Acers");
     }
 }

public class MultiInheritance__001 {

     public static void  main (String[] args){
         isSon props = new isSon();
         props.grandFatherProperty();
         props.fatherProperty();
         props.SonProperty();
     }
}
