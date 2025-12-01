package Polymorphism.OverRiding;


// child method override the Parent Method by using the @Override keyword

class Animal {
    void sound (){
        System.out.println(" Is Dog is Barking from Morning onWards");
    }
}

class Dog  extends Animal{
    @Override
    void sound (){
        System.out.println(" No it Quit From Morning");
    }
}

public class OverRiding__001 {

    public static void main (String[] args){
        Dog overRide = new Dog();

        overRide.sound();
    }
}
