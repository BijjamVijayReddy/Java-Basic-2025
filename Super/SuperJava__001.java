package Super;

// using "SUPER" KeyWord by using Parent Variables;

class Animal {
    String type = "Dog";

}

class IsAnimal extends Animal {

    void isDog(){
        System.out.println(super.type);
        System.out.println("Yes it was Dog");
    }
}

public class SuperJava__001 {

    public static void main (String[] args){
        IsAnimal obj = new IsAnimal();
        obj.isDog();
    }
}

