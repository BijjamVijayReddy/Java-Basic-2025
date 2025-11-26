package objects;

class carDetails {
     String carCompanyName;
     String carName;
     String carModel;
     double carMilage ;
     long carPrice;
     boolean isInsurance;

     void isCarNew(){
         System.out.println("It is Brand New Car form BMW");
     }

}

public class JavaObject__001 {

    public static void main (String[] args){

        carDetails car = new carDetails();
        car.carCompanyName = "BMW";
        car.carName  = "BMW X1";
        car.carModel = "sDrive18d M Sport";
        car.carMilage = 12.4;
        car.carPrice = 6464906l;
        car.isInsurance = true;
        car.isCarNew();
        System.out.println(car.carMilage);



    }
}
