import java.util.*;

public class nqueens{
    public static void main(String args[]){
       int n = 2;
        char board[][]=new char[n][n];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
        queens(board,0);

    }
    public static boolean issafe(char board[][],int row,int col){
        //vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonally up left
        for(int i=row-1, j=col-1;i,i>=0 && j>=0;i--;j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonally up right
        for(int i=row-1,j=col+1;i>=0&j<=board.length-1;i--;j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }
    public static void queens(char board[][],int row){
        //base condition
        if(row==board.length){
            printboard(board);
            return;
        }
        //recursion
       
            for(int j=0;j<board.length;j++){
                if(issafe(board,row,j)==true){board[row][j]='Q';
            queens(board,row+1);
            board[row][j]='x';

                }
           
        }

        
        
    }
    public static void printboard(char board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}