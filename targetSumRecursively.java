import java.util.Scanner;

public class targetSumRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[]arr = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int tar = scn.nextInt();
        pts(arr,0,"",0,tar);
        //initially
        //index of arr =0 //set is empty " " //sum of sets = 0
    }
    public static void pts(int[]arr,int idx, String set,int sos,int tar){
        if(idx==arr.length){//no more elements in the array
            if(sos==tar){
                System.out.println(set);
            }
            return;
        }
        pts(arr,idx+1,set+arr[idx]+",",sos+arr[idx],tar);//idx chose YES option
        pts(arr,idx+1,set,sos,tar);//idx chose NO option
    }
}
