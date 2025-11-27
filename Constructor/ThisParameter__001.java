package Constructor;

class myDeatils {
    String userName;
    int userAge;

    myDeatils(String userName,int userAge){
        this.userName = userName;
        this.userAge = userAge;

    }

}

public class ThisParameter__001 {

    public static  void main (String[] args){
        myDeatils obj = new myDeatils("Jai", 26);

        System.out.println(obj.userAge);
        System.out.println(obj.userName);

    }
}
