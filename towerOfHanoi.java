import java.util.Scanner;

public class towerOfHanoi {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int t1id = scn.nextInt();
        int t2id = scn.nextInt();
        int t3id = scn.nextInt();
        toh(n,t1id,t2id,t3id);
    }
    public static void toh(int n, int t1d, int t2d, int t3d){
        if(n==0){
            return;
        }
        toh(n-1, t1d,t3d,t2d);
        System.out.print(n + "["+t1d+"->"+t2d+"]"+", ");
        toh(n-1,t3d,t2d,t1d);
    }
}
