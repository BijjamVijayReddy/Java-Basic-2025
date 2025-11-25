package JavaObjects_001;

class userData {
    String userName;
    int userAge;
    long userMobileNum;
    boolean userStatus;
    double userHeight;
}

public class JavaObjectBasic_002 {

    public static void main (String[] arg){

        userData myData = new userData();

        myData.userName = " Jai";
        myData.userAge = 26;
        myData.userMobileNum = 9491467216L;
        myData.userStatus = false;
        myData.userHeight = 5.8;

        System.out.println(myData.userName);
        System.out.println(myData.userAge);
        System.out.println(myData.userStatus);
        System.out.println(myData.userHeight);
        System.out.println(myData.userMobileNum);
     }
}
