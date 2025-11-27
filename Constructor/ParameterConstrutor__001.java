package Constructor;

class myMobile {
    String myDeviceName;
    int myMobilePrice;
    long myDeviceBatter;

    myMobile(String deviceName,int mobilePrice,long deviceBatter){
         System.out.println("I am using Samsung S23 FE Edition ");

         myDeviceName = deviceName;
         myMobilePrice = mobilePrice;
         myDeviceBatter = deviceBatter;
    }

}

public class ParameterConstrutor__001 {

    public static void main (String[] args){
        myMobile obj = new myMobile("Samsung F23",29000,4200);

        System.out.println(obj.myDeviceName);
        System.out.println(obj.myDeviceBatter);
    }
}


