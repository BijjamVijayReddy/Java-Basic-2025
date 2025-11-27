package Constructor;

class myLaptop{
    String laptopName;
    int laptopPrice;

    myLaptop(String userLaptopName, int userLaptopPrice){
        laptopName = userLaptopName;
        laptopPrice = userLaptopPrice;

    }
}

public class ParameterConstructor__003 {

    public static  void main (String[] args){
        myLaptop obj = new myLaptop("Samsung", 53000);
        System.out.println(obj.laptopName);
        System.out.println(obj.laptopPrice);
    }
}
