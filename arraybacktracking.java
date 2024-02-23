import java.util.*;

public class arraybacktracking{
    public static void main(String args[]){
        int arr[]= new int[5];
        changearray(arr,0,1);
        printArray(arr);

    }
    public static void changearray(int arr[],int i, int val){
        //base case
        if(i==arr.length){
            printArray(arr);
            return;
        }
        //kaam
        arr[i]=val;
        changearray(arr,i+1,val+1);

        arr[i]=arr[i]-2;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}