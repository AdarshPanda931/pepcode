import java.util.Scanner;

public class knightsTourRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = scn.nextInt();//start
        int col = scn.nextInt();//start
        int[][] chess = new int[n][n];
        kt(chess,row,col,1);
    }
    public static void kt(int[][] chess, int r, int c, int move){

    }
}
