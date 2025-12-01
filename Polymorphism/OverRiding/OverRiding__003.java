package Polymorphism.OverRiding;


class ProStack2021 {
    void course () {
        System.out.println("I am Learning the React JS Front End Development");
    }
}

class ProStack2024 extends  ProStack2021 {

    @Override
    void course (){
        System.out.println(" I am Starting Learning Mern Stack");
    }
}

class ProStack2025 extends ProStack2024 {
    @Override
    void course (){
        System.out.println("This Year i am Java Full Stack Developer");
    }
}

public class OverRiding__003 {

    public static void main (String[] args){
        ProStack2025 overRide = new ProStack2025();
        overRide.course();
    }
}
