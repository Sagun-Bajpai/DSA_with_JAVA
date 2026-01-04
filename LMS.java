
import java.util.ArrayList;

public class LMS {
    public static void main(String[] args) {
      Details student_1=new Details("gungun",10001,9.2);
      Details student_2=new Details("mahek",16651,8.2);
      Details student_3=new Details("sona",17641,7.2);
     // System.out.println(student_1.name);
      Details[]students={student_1,student_2,student_3};
      //
}
}
class Details{
   String name;
   int id;
   Double marks;
   Details(String text,int number1,Double number2){
    this.name=text;
    this.id=number1;
    this.marks=number2;
   }

   public String toString(){
    return "student name" +name+" "+"student_id"+ id+" "+"student_marks"+marks;
   }
}
