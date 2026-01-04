package Array_with_java;

public class ReverseAnArray2 {
    static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ,");
        }
        System.out.println();
    }
    // int[] means ye  integer value ka ek array data type return krr rha
    static int[] ReverseArray(int[]arr){
        int n=arr.length;
        int [] ans=new int[n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];

        }
        return ans;
    }
    public static void main(String[]args){
        int[] arr={2,4,6,8,9,10};
        int[]ans=ReverseArray(arr);
        printArray(ans);
    }
    
}
