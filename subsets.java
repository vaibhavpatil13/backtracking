import java.util.*;

public class subsets{
    public static void main(String args[]){
        String str = "abc";
        substr(str," ",0);
    }
    public static void substr(String str, String ans, int i){
        //base case
        if(i==str.length()){
            if(ans==" "){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        substr(str,ans+str.charAt(i),i+1) ;   //yes choice
        substr(str,ans,i+1)   ;          //no choice 
    }
}