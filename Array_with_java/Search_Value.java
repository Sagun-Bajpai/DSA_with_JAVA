//Search the given element x in the array.if present then return the index else return -1
package Array_with_java;
class SearchOfIndex{
    void Search(){
        int arr[]={2,4,6,10};
        int x=2;
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                
            }
        }
        System.out.println("found 6 at index=" + ans);
    }
}

public class Search_Value {
    public static void main(String[] args) {
        SearchOfIndex obj=new SearchOfIndex();
        obj.Search();
    }
}
