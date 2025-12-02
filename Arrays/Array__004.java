    package Arrays;


    public class Array__004 {

        public static void main (String[] args){

            int[] userNumber = {9,4,29,91,42,26,7,2,10,6};
              int largestNumber = userNumber[0];

              for(int i = 1;i < userNumber.length ; i++){
                  System.out.println(userNumber[i] );
                  if(userNumber[i] > largestNumber){
                      largestNumber = userNumber[i];
                  }
              }

              System.out.println(largestNumber);
        }
    }
