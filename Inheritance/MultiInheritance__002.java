package Inheritance;


class myGrandFather {
    void isGrandFatherEarned(){
        System.out.println("Yes Grand Father has 10 Acers");
    }
}

class myFather extends myGrandFather{
    void isFatherEarned(){
        System.out.println("My Father Brought 10 more Acerers");
    }
}

class mySelf extends myFather{
    void myProperty(){
        System.out.println("I did not earned or Brought the new Land");
    }
}

public class MultiInheritance__002 {

    public static void main (String[] args){
          mySelf property = new mySelf();
          property.isFatherEarned();
          property.isFatherEarned();
          property.myProperty();
          property.isGrandFatherEarned();
    }
}
