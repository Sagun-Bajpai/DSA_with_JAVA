class ArrayExample{
    void demoArrays(){
        int [] ages=new int[3];
        String[] names =new String[3];
        ages[0]=34;
        ages[1]=35;
        ages[2]=36;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        
    }
}

public class MyArray {
    public static void main(String[]args){
        ArrayExample obj=new ArrayExample();
        obj.demoArrays();
    }
}