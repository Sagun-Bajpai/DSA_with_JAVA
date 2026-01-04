package lecture_8_loops_que;
import java.util.Scanner;
public class sum_of_series {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();// 1-2+3-4+5-6+7-8+9-10..........n terms this is series
        int ans=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                ans -=i;
            }
            else{
                ans +=i;
            }
        }
        System.out.println(ans);
    }
}
