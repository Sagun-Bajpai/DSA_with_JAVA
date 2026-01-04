package Array_with_java;

class Array3DExample {
    void multiArray() {
        int[][][] arr_3 = new int[1][2][2];
        arr_3[0][0][0] = 65;
        arr_3[0][0][1] = 76;
        arr_3[0][1][0] = 98;
        arr_3[0][1][1] = 67;
      
        System.out.println(arr_3[0][0][0]);
        System.out.println(arr_3[0][0][1]);
        System.out.println(arr_3[0][1][0]);
        System.out.println(arr_3[0][1][1]);
        System.out.println(arr_3.length);
        for(int i=0;i<=1;i++){
            System.out.println(arr_3[i]);

        }

    }
}

public class array_3D {
    public static void main(String[] args) {
        Array3DExample obj = new Array3DExample();
        obj.multiArray();
    }

}
