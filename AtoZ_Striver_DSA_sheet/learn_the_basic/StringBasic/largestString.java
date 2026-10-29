package AtoZ_Striver_DSA_sheet.learn_the_basic.StringBasic;

public class largestString {
      public static void main(String[]args){
        String []fruits={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        //largest string is defined in lexicografical order
        System.out.println("the largest string is :"+largest);
    }
    
}
