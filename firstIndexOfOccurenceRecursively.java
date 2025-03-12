import java.util.Scanner;

public class firstIndexOfOccurenceRecursively {
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
        System.out.println("data");
        int d = scn.nextInt();
        int ans = fio(arr,idx,d);
        System.out.println(ans);
    }
    public static int fio(int[]ar, int idx, int x){
        if(idx==ar.length){
            return -1; //outer bound element is not found so return -1
        }
        int fiosa = fio(ar, idx+1, x); //return the index of occurence
        if(x==ar[idx]){
            return idx;
        }else{
            return fiosa;
        }
    }
}
