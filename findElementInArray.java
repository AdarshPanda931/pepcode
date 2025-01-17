import java.util.Scanner;

public class findElementInArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();//input n
        //declare a array of n size
        int[] arr = new int[n];
        //fill the content of array
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        //take the test element
        int d = scn.nextInt();
        //check if it exist
        int res = -1;
        for(int i=0; i<arr.length; i++){
            if(d == arr[i]){
                res  = i;
                break; //print the 1st found incase of repeatative
            }
        }
        System.out.println(res);
    }
}
