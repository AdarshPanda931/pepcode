import java.util.Scanner;

public class allIndicesInArrayRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("size");
        int n = scn.nextInt();

        int[] arr = new int[n];
        System.out.println("array");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }

        System.out.println("data");
        int x = scn.nextInt();

        int[] iar = ai(arr,x,0,0);//store the result of the function in an array
        if(iar.length ==0){
            System.out.println();
            return;
        }
        for(int i=0; i<iar.length;i++){
            System.out.println(iar[i]);
        }
    }
    public static int[] ai(int[]ar, int x,int idx, int fsf){//fsf is the count of x found
        if(idx == ar.length){
            return new int[fsf];
        }
        if(ar[idx]==x){
            //make an array iar to catch that newly returned array
            int iar[] = ai(ar, x, idx+1, fsf+1);//both index and count increases by i
            iar[fsf]=idx;//fill the fsf position with the index in the output array
            return iar;//return that array for further process
        }else{
            int iar[] = ai(ar, x, idx+1, fsf);//only index increases not fsf
            return iar;
        }

    }
}
