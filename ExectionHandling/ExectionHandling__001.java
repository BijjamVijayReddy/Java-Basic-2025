package ExectionHandling;

public class ExectionHandling__001 {

    public static void main (String[] args){

        int [] array ={1,4,2,4,2,6,7};

        try {
            System.out.println(array[20]);
        }catch (Exception e){
            System.out.println("Index is Not There");
        }
    }
}
