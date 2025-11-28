package Super;

//Using super to call parent method

class Bottle{
    void drink (){
        System.out.println("Drink Some Water");
    }
}

class Borosil extends Bottle{

    void drinkWater(){
        System.out.println("Drink Some Water After 10 Mins");
    }

    void isDrinkWater (){
        super.drink();
        drinkWater();
    }
}

public class SuperJava__003 {

   public static void main (String[] args){
       Borosil obj = new Borosil();
       obj.isDrinkWater();
   }

}
