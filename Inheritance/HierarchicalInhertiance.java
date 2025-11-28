package Inheritance;

class FatherProp {
    void fatherProperties (){
        System.out.println("Father has Big House");
    }
}

class FirstSon extends  FatherProp {
    void firstSonProp(){
        System.out.println(" First Born has Honda 350 RS Bike");
        System.out.println(" Fist Son Recently Brought the Hundiya Venu Car");
    }
}

class SecondSon  extends  FatherProp{
    void secondSonProp(){
        System.out.println(" Second son Brought the MT 15");
        System.out.println("Second Son Got Job in Big 4 Compaines, Company Name is EY");
    }
}

public class HierarchicalInhertiance {

    public static void main (String[] args){
        FirstSon  firstObj = new FirstSon();
        firstObj.fatherProperties();
        firstObj.firstSonProp();

        System.out.println();

        SecondSon secondObj = new SecondSon();
        secondObj.fatherProperties();
        secondObj.secondSonProp();
    }
}
