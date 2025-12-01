package Polymorphism.OverLoading;


// overLoading has Same Class with Different Parameters


class overLoading {

    void show(String name) {
        System.out.println(" My Name is" + name);
    }

    void show(String name, int age){
         System.out.println(" My Age is" + age);

    }

}

public class OverLoading__001 {

    public static void main (String[] args){
        overLoading ploy = new overLoading();
        ploy.show("Jai");
        ploy.show("Prabhas", 46);
    }

}
