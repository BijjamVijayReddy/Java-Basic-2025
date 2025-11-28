package Super;

class myName {
    String userName = "Jai";

}

class userData extends myName{

    void isUserPresent (){
        System.out.println(super.userName);
        System.out.println("This User Still Active ");
    }
}

public class SuperJava__002 {

    public static void main (String[] args){
        userData obj = new userData();
        obj.isUserPresent();
    }
}

