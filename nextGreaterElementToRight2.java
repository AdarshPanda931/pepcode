import java.util.Scanner;
import java.util.Stack;

public class nextGreaterElementToRight2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length;i++){
            arr[i] = scn.nextInt();
        }

        //make a new array to store ans
        int[]nge = new int[arr.length];
        //make a stack to perform operaton in less iteration
        Stack<Integer>st = new Stack<>();
        //instead of putting the values now put the position of values in stack ✅
        st.push(0);
        for(int i= 1; i<arr.length; i++){
            while(st.size()>0 && arr[i]>arr[st.peek()]){//arr[st.peek()] coz st.peek() contains the position
                int pos = st.peek();
                nge[pos] = arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size() >0){
            int pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }

        for(int i=0; i<nge.length; i++){
            System.out.println(nge[i]);
        }
    }
}
