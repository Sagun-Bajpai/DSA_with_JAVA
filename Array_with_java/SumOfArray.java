package Array_with_java;
class Array_1D_Example{
    void Sum(){
        int arr_1[]= {3,4,5,6,1,8};
        int sum=0;
        for(int i=0;i<arr_1.length;i++){
            sum=sum+arr_1[i];
           
        }
         System.out.println(sum);


    }
}
public class SumOfArray {
    public static void main(String[]args){
        Array_1D_Example obj=new Array_1D_Example();
        obj.Sum();// we are calling of sum

    }
}
