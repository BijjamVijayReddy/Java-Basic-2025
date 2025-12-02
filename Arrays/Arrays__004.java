package Arrays;

// Smallest Number
public class Arrays__004 {

    public static void main (String[] args){
        int[] num = {5,6,3,4,9,4,2,5,1,4};
        int smallestNum = num[0];

        for (int j =0; j < num.length ; j++){
//            System.out.println(num[j]);
            if(num[j] < smallestNum){
                smallestNum = num[j];
            }
        }

        System.out.println(smallestNum);
    }
}
