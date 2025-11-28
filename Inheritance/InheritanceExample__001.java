package Inheritance;


class Car{
    void Start(){
        System.out.println("Car is Starting");
    }
}

class BMW extends Car{

    void SportMode(){
        System.out.println(" Let Ride and Start the Car with Full Mode");
    }
}

public class InheritanceExample__001 {

    public static void main (String[] args){

        BMW obj = new BMW();
        obj.Start();
        obj.SportMode();

    }
}
