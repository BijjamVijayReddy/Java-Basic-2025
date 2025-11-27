package Constructor;


class BikeDetails{
    String bikeName;
    long bikePrice;
    double bikeMillage;
    int bikeFuelTank;
    long bikeTotalKms;
    boolean bikeIsInsurance;


    BikeDetails(){
        System.out.println("I am using Honda 350RS");
        bikeName = "Honda 350 RS";
        bikePrice = 262000l;
        bikeMillage = 25.7;
        bikeFuelTank = 12;
        bikeIsInsurance = false;
        bikeTotalKms = 4650;
    }


}

public class ConstructorWithoutArg__002 {

    public  static void main (String[] args){
        BikeDetails obj = new BikeDetails();
        System.out.println(obj.bikeName);
        System.out.println(obj.bikePrice);
        System.out.println(obj.bikeMillage);
    }
}
