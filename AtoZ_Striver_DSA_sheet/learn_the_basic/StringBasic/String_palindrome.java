package AtoZ_Striver_DSA_sheet.learn_the_basic.StringBasic;
public class String_palindrome {
    public static boolean isPalindrome(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        String str="madam";
        System.out.print(isPalindrome(str));


    }
    
}
