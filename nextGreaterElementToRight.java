import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElementToRight {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //size of input array
        int[] arr = new int[n]; //declare a array
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt(); //put elements in the array
        }
        //make a new array to store the answer
        int[] nge = new int[arr.length];
        Stack<Integer>st = new Stack<>(); //initialise a stack to perform trail of justice operation

        //push right most element of og array i.e arr[] to newly created empty stack i.e st
        st.push(arr[arr.length-1]);
        //put -1 as ans at the right most postion in the newly made empty array i.e nge[] for the NGETR of right most
        nge[arr.length -1] = -1;
        //start checking from the 2nd right most elemnt till the 1st element of og array
        for(int i = arr.length-2; i>=0; i--){
            // pop - ans - push
            while(st.size() >0 && arr[i] >= st.peek()){
                st.pop();//pop till stack contain element AND arr[i] is greater than top of stack
            }
            //if stack is empty
            if(st.size() ==0){
                nge[i] =-1;//put -1 in the new array
            }else{ //we get a greater element at top of stack
                nge[i]=st.peek();//put that top element in the new array
            }
            st.push(arr[i]); //atlast push itself to the  stack to face justice operation
        }
        //print the ans array
        for(int i=0; i< nge.length; i++){
            System.out.println(nge[i]);
        }
    }
}
