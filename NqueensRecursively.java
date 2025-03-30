import java.util.Scanner;

public class NqueensRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess= new int[n][n];
        pnq(chess," ",0);//start from 0th row
    }
    public static void pnq(int[][] chess,String qsf,int row){
        if(row==chess.length){
            System.out.println(qsf);
            return;
        }
        for(int col=0;col<chess[0].length;col++){
            chess[row][col]=1;//place the queen at one col of a row
            pnq(chess,qsf+row+"-"+col+",", row+1);//move to next row
            chess[row][col]=0;//remove the queen after 1 set of operation for all row is over
        }
    }
//unfinished code
}
