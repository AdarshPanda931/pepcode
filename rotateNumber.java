import java.util.Scanner;

public class rotateNumber {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();//no of rotation

        int count=0;
        int temp = n;
        while(temp>0){
            temp = temp/10;
            count++;
        }
        k = k % count; // edge case if no. of rotation is greater than no. of digits
        if(k<0){       // edge case for -ve rotation
            k = k + count;
        }

        int div = 1;
        int mult =1;
        for(int i =1; i<= count; i++ ){
            if(i<=k){
                div = div *10;
            }else{
                mult = mult*10;
            }
        }
        int q = n/div;
        int r = n% div;
        int res = r * mult + q;
        System.out.println(res);

    }
}
