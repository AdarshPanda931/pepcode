import java.util.Scanner;
//STACK OVER FLOW ERROR

public class floodFillNowRecursivelyLaterDFS {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr= new int[n][m];
        for(int i=0;i<arr.length;i++){//n ->length of 1 row
            for(int j=0; j<arr[0].length;j++){ //m -> length of 1st column
                arr[i][j] = scn.nextInt();
            }
        }
        ff(arr,0,0,"");//start is 0,0
    }
    //stupid recursion call
    //smart base case
    public static void ff(int[][] maze,int row, int col, String psf){
        if(row<0 || row>=maze.length ||col<0||col>=maze[0].length || maze[row][col]==1){
            return; //5.boundary condition and [obstacle(1) at last]
        }
        if(row ==maze.length-1 && col == maze[0].length-1){
            System.out.print(psf);
            return;
        }
        ff(maze,row-1,col,psf+"t");//1.one step top
        ff(maze,row,col-1,psf+"l");//2.one step left
        ff(maze,row+1,col,psf+"d");//3.one step down
        ff(maze,row,col+1,psf+"r");//4.one step right
    }
}
