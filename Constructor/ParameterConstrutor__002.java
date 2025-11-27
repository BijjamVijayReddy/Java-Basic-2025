package Constructor;

// User User Details;

class userDetails {
    String userName;
    int userAge;
    long userMobileNum;
    boolean isSingle;
    String userCurrentCompany;
    boolean isPF;


    userDetails(String personName, int personAge, long personMobileNum , boolean personSingle , String personCurrentCompany, boolean isPersonPF){
        userName = personName;
         userAge = personAge;
         userMobileNum = personMobileNum;
         isSingle = personSingle;
         userCurrentCompany = personCurrentCompany;
         isPF = isPersonPF;
    }

}


public class ParameterConstrutor__002 {

    public static void main (String[] args){

        userDetails obj = new userDetails("Vijay",26,9491467216l,true,"GloablLogic Pvt Ltd",true);

        System.out.println(obj.userName);
        System.out.println(obj.isSingle);
        System.out.println(obj.userAge);
    }
}
