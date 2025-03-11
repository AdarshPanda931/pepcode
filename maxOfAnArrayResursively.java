import java.util.Scanner;

public class maxOfAnArrayResursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("size");
        int n = scn.nextInt();
        int [] arr = new int[n];
        System.out.println("array");
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        System.out.println("index");
        int idx= scn.nextInt();
        System.out.println(moa(arr,idx));
    }
    public static int moa(int[]ar, int idx){
        if(idx==ar.length-1){
            return ar[ar.length-1];
        }
        int t = moa(ar,idx+1);
        if(ar[idx] > t){
            return ar[idx];
        }else{
            return t;
        }
    }
}
