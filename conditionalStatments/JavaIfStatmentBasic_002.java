package conditionalStatments;

public class JavaIfStatmentBasic_002 {

    public static void main (String[] args){

        int attendenceObtained = 64;

        if (attendenceObtained >= 74){
            System.out.println(" You don't need to Pay Fine");
        } else if (attendenceObtained >= 60) {
             System.out.println(" You need to pay 15,000 Ruppes Only");
        }else if (attendenceObtained >= 50) {
            System.out.println("You need to Pay  25,000 Rupees Only");
        } else {
           System.out.println("You need to Pay 40,000 Rupess Only");
        }
    }
}
