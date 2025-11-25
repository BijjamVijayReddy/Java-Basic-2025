package conditionalStatments;

public class JavaConditionalStatments_001 {

    public static void main(String[] arg) {

        int voteAge = 18;
        int userAge = 20;
        String userName = "Jai";

        if (userAge >= voteAge ) {
            System.out.println("You are eligible for Voting");
        } else if (userName == "Jai" && userAge > 15){
            System.out.println(" Jai can vote at any Age");
        }
        else {
            System.out.println("First you need to complete the 18 Years");
        }
    }
}
