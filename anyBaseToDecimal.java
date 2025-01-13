import java.util.Scanner;

public class anyBaseToDecimal {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int res = dec(n,b);
        System.out.println(res);
    }

    public static int dec(int a, int b){
        int sum =0;

        int p = 1;
        while(a>0){
            int r = a%10;
            sum = sum + r*p;
            p = p*b;
            a=a/10;
        }


        return sum;
    }
}
