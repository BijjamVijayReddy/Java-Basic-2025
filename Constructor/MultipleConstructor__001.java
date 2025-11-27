package Constructor;

class userData{
 String userName;
 int userAge;
 String userNickName;
 boolean isMarried;

 userData( String userName){
     this.userName = userName;
 }

 userData(String userName , int userAge){
     this.userName = userName;
     this.userAge = userAge;
 }

 userData(String userName, int userAge,boolean isMarried, String userNickName){
     this.userName = userName;
     this.userAge = userAge;
     this.isMarried = isMarried;
     this.userNickName = userNickName;
 }


}

public class MultipleConstructor__001 {

    public static  void main (String[] args){

        userData user001 = new userData("Vijay");
        userData user002 = new userData("Prabhas",45);
        userData user003 = new userData("JNTR",38,true,"Tiger");

        System.out.println(user002.userName);
        System.out.println(user001.userName);
        System.out.println(user003.userName);
        System.out.println(user003.userNickName);
        System.out.println(user002.isMarried);
    }
}


