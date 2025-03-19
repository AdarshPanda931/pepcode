import java.util.Scanner;

public class printStairPathsRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        psp(n,"");
    }
    public static void psp(int stair, String path){
        if(stair<0){
            return;//journey is over nether ans nor print
        }
        if(stair==0){
            System.out.println(path);
            return;
        }
        //option are 1,2,3
        psp(stair-1, path+"1");
        psp(stair-2, path+"2");
        psp(stair-3, path+"3");
    }
}
