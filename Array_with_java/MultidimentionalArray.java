package Array_with_java;
class ArrayExample{
    void multiArray(){
       // int [][] arr_1=new int[3][3];
        int [][] arr={{56,43,6,5},{34,7,8,35},{12,65,88,98}};// this is a 2D array_ element is 3X3=9, similarly we can write any  type of dimentinal array.
        System.out.println(arr.length);// outpiut is 3 ,this is a lenth of array
        System.out.println(arr[0][0]);//56
        System.out.println(arr[0][1]);//43
        System.out.println(arr[0][2]);//6

        System.out.println(arr[1][0]);//34
        System.out.println(arr[1][1]);//7
        System.out.println(arr[1][2]);//8

        System.out.println(arr[2][0]);//12
        System.out.println(arr[2][1]);//56
        System.out.println(arr[2][2]);//8
        // for loop for 2d array
        // arr.length=3,,a[i].length=4
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}

public class MultidimentionalArray {
    public static void main(String[]args){
        ArrayExample obj=new ArrayExample();
        obj.multiArray();//calling of multi array
    }
    
}
