import java.util.Scanner;

public class powerLinear {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = powerLinear(x,n);
        System.out.println(ans);
    }
    public static int powerLinear(int x, int n){
        if(n==1){
            return x;
        }
        int plnm1 = powerLinear(x, n-1);
        int pln = x*plnm1;
        return pln;
    }
}
