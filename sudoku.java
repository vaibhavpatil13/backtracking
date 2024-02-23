import java.util.*;

public class sudoku{
    public static void main(String args[]){
        int sud[][]={

    };
    if(sudokusolv(sud,0,0)){
        System.out.print("solution exits");
        printsud(sud);
    }else{
        System.out.print("solution not exits");
    }

    }
    
}
public static boolean issafe(int sud[][],int row,int col, int digit){
    //column
    for(int i=0;i<9;i++){
        if(sud[row][i]==digit){
            return false;
        }
    }
    //row
    for(int j=0;j<9;j++){
        if(sud[j][col]==digit){
            return false;
        }
    }
    //grid
    int sr = (row/3)*3;
    int sc = (col/3)*3;

    for(int i=sr;i<sr+3;i++){
        for(int j=col;j<col+3;j++){
            if(sud[i][j]==digit){
                return false;
            }
        }
    }

    return true;
}
public static booelan sudokusolv(int sud[][],int row,int col){ 
    //base condition
    if(row==9){
        return true;
    }
    int nextrow = row;
    int nextcol =col+1;

    if(col==9){
        nextrow = row+1;
        nextcol =0 ;
    }
    //recursion
    for(int digit=0;digit<=9;digit++){
        if(issafe(sud,row,col,digit)){
            sud[row][col]=digit;
            if(sudokusolv(sud,nextrow,nextcol)){
                return true;
            }
            sud[row][col] = 0;

        }
    }
}