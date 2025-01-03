import java.util.*;
public class allPrimesInBetween {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        for(int i=n1; i<n2; i++){
            boolean isPrime = true;
            for(int j = 2; (j*j)<=i; j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime == true){
                System.out.println(i);
            }
        }
    }
}
