package Constructor;


// Constructor Help Run Automatically when Object is Created

class Student {

    String studentName;
    int studentAge;
    String studentCourse;
    long studentFee;

    //noArg in Constructor

    Student(){
      System.out.println(" This is ProStack Students");
      studentName = "Jai";
      studentAge = 26;
      studentCourse = "Java Full Stack";
      studentFee = 28000l;

    }

}

public class ConstructorWithOutArg {

    public static void main(String[] args){
        Student obj = new Student();

        System.out.println(obj.studentName);
        System.out.println(obj.studentCourse);
        System.out.println(obj.studentFee);
    }
}
