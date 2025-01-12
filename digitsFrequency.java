import java.util.Scanner;

public class digitsFrequency {
    public static int digitFreq(int x, int y){
        int temp = x;
        int count =0;
        while(temp !=0){
            int rem = temp%10;
            if(rem == y){
                count++;
            }
            temp = temp/10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int result = digitFreq(n,d);
        System.out.println(result);
    }
}
