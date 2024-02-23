import java.util.*;

public class gridways{
    public static void main(String args[]){
        int n=3,m=3;
        System.out.print(count(0,0,n,m));

    }
    public static int count(int i, int j, int n, int m){
        //base condition
        if(i==n-1&&j==m-1){
            return 1;  //at target only 1 way
        }
        else if(i==n||j==m){
            return 0 ; //out of boundry condition
        }
        //recursion
        int grid1 = count(i+1,j,n,m);    //down side

        int grid2= count(i,j+1,n,m);        //right side

        return grid1+ grid2;
    }
}