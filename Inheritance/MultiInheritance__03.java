package Inheritance;

//Department: Development
//Team: Frontend Team
//Employee: Jai working as React Developer

class Department {

    void myRole (){
        System.out.println(" i am Development the Web Applications ");
    }
    };

class Team extends  Department {
    void myTeam (){
        System.out.println("I am In Front End Team");
    }
}

 class Employee extends Team {
    void isEmployee (){
        System.out.println(" I am Front End Developer");
    }
 }




public class MultiInheritance__03 {

    public static void main (String[] args){
        Employee myTeam = new Employee();
        myTeam.myRole();
        myTeam.myTeam();
        myTeam.isEmployee();
    }
}
