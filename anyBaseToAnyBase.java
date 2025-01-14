import java.util.Scanner;

public class anyBaseToAnyBase {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int res = getValue(n, b1,b2);
        System.out.println(res);
    }
    public static int getValue(int n, int a, int b){
        int dec = bToD(n,a);
        int destNo =dtoB(dec, b);
        return destNo;
    }
    public static int bToD(int n, int b){ //source base to decimal 
        int sum1 =0;
        int p =1;
        while(n>0){
            int r= n%10;
            sum1 = sum1 + r*p;
            p = p*b;
            n = n/10;
        }
        return sum1;
    }
    public static int dtoB(int n, int b){ //decimal to required base
        int sum2 =0;
        int p =1;
        while(n>0){
            int r = n%b;
            sum2 = sum2 + r*p;
            p= p*10;
            n=n/b;
        }
        return sum2;
    }
}
