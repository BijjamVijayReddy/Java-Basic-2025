package Super;

class Salaar {
    Salaar() {   // parent constructor
        System.out.println("Kanashar ka Salaar");
    }

    void Deva() {
        System.out.println("Salaar Deva is Powerful");
    }
}

class DevaRadha extends Salaar {

    DevaRadha() {
        super();   // calling parent constructor
        System.out.println("is Danger");
    }
}

public class SuperJava__004 {
    public static void main(String[] args) {
        DevaRadha netflix = new DevaRadha();
        netflix.Deva();
    }
}
