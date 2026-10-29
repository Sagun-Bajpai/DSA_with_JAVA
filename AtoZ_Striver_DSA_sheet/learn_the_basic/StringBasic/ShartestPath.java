package AtoZ_Striver_DSA_sheet.learn_the_basic.StringBasic;

public class ShartestPath {
    public static float Shortestpath(String path){
        int n= path.length();
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            char dir=path.charAt(i);
            
            //for South
            if(dir=='S'){
                y--;
            }
            //for North
            else if(dir=='N'){
                y++;
            }
            else if(dir=='W'){
                x--;
            }
            //for East
            else{
                x++;
            }

            

            

        }  
        //calculate displatment using distance formula
        int Xsquare=(x-0)*(x-0);
        int Ysquare=(y-0)*(y-0);
        return (float)Math.sqrt(Xsquare + Ysquare);
            
    }
    public static void main(String[]args){
        String path=new String("WNEENESENNN");
        System.out.println("shortest path is: "+Shortestpath(path));
    }
    
}
