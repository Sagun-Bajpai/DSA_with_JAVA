//claculate the maximum value inside the array
package Array_with_java;
class MaxValue{
    void MaxOfArray(){
        int arr[]={10,7,8,9,3,15,16};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]>ans){
                ans=arr[i];
                 

            }
        }
        System.out.println("Max of value inside array=" + ans);
       
    }
}
public class Max_value {
    public static void main(String[]args){
        MaxValue obj=new MaxValue();
        obj.MaxOfArray();
    }
}


/*
 

import java.util.Scanner;
class Main {
    static int max(int arr[]){
        
        int ans=arr[0];
         for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
         
        }
        }
            return ans ;
    }
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("enter the element");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
         System.out.println("maximum value of array is:"+ max(arr));
    }
    


    output is;
    enter the element
1 2 3 4 5 
maximum value of array is:5

}
 */