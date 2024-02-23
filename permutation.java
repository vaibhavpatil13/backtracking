import java.util.*;

public class permutation{
    public static void main(String args[]){
        String str = "abc";
        permu(str," ");
    }
    public static void permu(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newstr = str.substring(0,i)+ str.substring(i+1);

            permu(newstr,ans+curr);
        }
    }
}