package Inheritance;

//Father has 2BHK house
//Son has BMW


class Father{
    void FatherStatus(){
        System.out.println("Father has 2BHK house");
    }
};

class Son extends Father {
    void SonStatus(){
        System.out.println("Son has BMW");
    }
}

public class InheritanceJava__002 {

    public static void main (String[] args){
        Son prop = new Son();
        prop.FatherStatus();
        prop.SonStatus();
    }
}
