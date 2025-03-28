import java.util.Scanner;

public class floodFillNowRecursivelyLaterDFS2 {
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
        //to remove stackoverflow error(contineous infinite motion between starting 2 cell)
        //make a boolean array to keep an check
        boolean[][]visited = new boolean[n][m];//by default it has false

        ff(arr,0,0,"",visited);//start is 0,0
    }
    //stupid recursion call
    //smart base case
    public static void ff(int[][] maze,int row, int col, String psf, boolean[][] visited){
        if(row<0 || row>=maze.length ||col<0||col>=maze[0].length
                || maze[row][col]==1 || visited[row][col]== true){
            return; //5.boundary condition and [obstacle(1) at last]
        }
        if(row ==maze.length-1 && col == maze[0].length-1){
            System.out.println(psf);
            return;
        }
        visited[row][col]=true;
        //when reach new cell 1st mark it true before going deep recursion
        
        ff(maze,row-1,col,psf+"t",visited);//1.one step top
        ff(maze,row,col-1,psf+"l",visited);//2.one step left
        ff(maze,row+1,col,psf+"d", visited);//3.one step down
        ff(maze,row,col+1,psf+"r", visited);//4.one step right

        visited[row][col]= false;
        //remove the visited mark while coming back from recursion to explore more paths
    }
}
/*
test case 1
6
7
0
1
0
0
0
0
0
0
1
0
1
1
1
0
0
0
0
0
0
0
0
1
0
1
1
0
1
1
1
0
1
1
0
1
1
1
0
0
0
0
0
0

op- ddrdddrrrrrddrrttrrrrddlldddrrddrrrrdddrr

 */