import java.util.Scanner;

public class printMazePathWithJumpRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        pmp(1,1,n,m,"");
    }
    public static void pmp(int sr, int sc, int dr, int dc, String path){
        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(path);
            return;
        }
        //3 broad option, each with multiple options. so for loop of options
        for(int i=1; i<dc;i++){
            pmp(sr, sc+i, dr,dc,path+"h"+i);
        }
        for(int i=1; i<dr-sr;i++){
            pmp(sr+i, sc, dr,dc,path+"v"+i);
        }
        for(int i=1; i<dc && i<dr;i++){
            pmp(sr+i, sc+i, dr,dc,path+"d"+i);
        }
    }
}
