import java.util.ArrayList;
import java.util.Scanner;

public class GetMazePathsRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//row
        int m = scn.nextInt();//col

        ArrayList<String> list = gmp(1,1,n,m);
        System.out.println(list);
    }
    public static ArrayList<String> gmp(int sr,int sc,int dr, int dc){

        if(dr==1 && dc==1){
            ArrayList<String>t = new ArrayList<>();
            t.add("");
            return t;
        }else if(dr<=0 || dc<=0){
            ArrayList<String>f = new ArrayList<>();
            return f;
        }
        ArrayList<String>vp = gmp(sr, sc, dr-1, dc);
        ArrayList<String>hp = gmp(sr, sc, dr, dc-1);
        ArrayList<String>ep = new ArrayList<>();

        for(String i:vp){
            ep.add(i+"v");
        }
        for(String j:hp){
            ep.add(j+"h");
        }
        return ep;
    }
}
