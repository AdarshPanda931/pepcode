import java.util.Scanner;

public class displayArrayInReverse {
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
        dar(arr,idx);
    }
    public static void dar(int[]ar, int idx){
        if(idx==ar.length){
            return;
        }
        dar(ar,idx+1);
        System.out.println(ar[idx]);
    }
}
