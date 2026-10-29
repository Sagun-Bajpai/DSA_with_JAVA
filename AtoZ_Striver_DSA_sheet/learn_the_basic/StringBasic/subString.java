package AtoZ_Striver_DSA_sheet.learn_the_basic.StringBasic;

public class subString {

    public static String SubString(String str,int Si,int Ei){
        String substr="";
        for(int i=Si;i<Ei;i++){
            substr += str.charAt(i);
        }
        return substr;
        
    }
    public static void main(String[]args){
        String str="HelloWoarld";

        System.out.println(SubString(str,0,5));

        //using inbuilt method;
        System.out.print("using substring() method: ");
        System.out.println(str.substring(1,6));
    }
    
}
