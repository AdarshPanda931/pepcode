import java.util.Scanner;

public class printMazePathRecursively {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int m = scn.nextInt();
        pmp(1,1,n,m,"");
    }
    public static void pmp(int sr,int sc,int dr,int dc, String path){
        //2 option h,v
        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(path);
            return;
        }
        pmp(sr,sc+1,dr,dc,path+"h");
        pmp(sr+1,sc,dr,dc,path+"v");
    }
}
