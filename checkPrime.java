import java.util.*;
public class checkPrime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        int count =0;

        while (t>0){
            int n = scn.nextInt();
            //algo1 - lop from 1 to n & divide the n, if remainder is 0 more than 2 time = not prime
            for(int d =1; d<=n; d++){
                if(n%d == 0){
                    count ++;
                }
            }
            if(count == 2){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
            t--;
        }

    }
}
