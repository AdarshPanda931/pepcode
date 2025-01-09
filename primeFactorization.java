import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int n1 = n;

        int i =2;
        while(n1!=1){
            while(n1%i == 0){
                int q = n1/i;
                n1 = q;
                System.out.print(i+ " ");
            }
            i++;
        }
    }
}
