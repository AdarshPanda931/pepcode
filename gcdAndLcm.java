import java.util.Scanner;

public class gcdAndLcm {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n11 = scn.nextInt();
        int n22 = scn.nextInt();

        int n1 = n11;
        int n2 = n22;
        while(n1 % n2 !=0){
            int rem = n1 % n2;
            n2 = rem;
            n1 = n2;
        }
        int gcd = n2;
        int lcm = (n11*n22) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
