import java.util.Scanner;
import java.util.Stack;

public class largestAreaHistogram {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        //NSETR= NEXT SMALLER ELEMENT TO RIGHT
        /** 1. NSETR is the array of indexes for respective elements**/
        int[] rb = new int[arr.length];//nse index on right is right boundry
        Stack<Integer>st = new Stack<>();
        st.push(arr.length-1);//last element
        rb[arr.length-1]=arr.length;//set default
        for(int i= arr.length-1; i>=0;i--){
            while(st.size()>0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() ==0){
                rb[i] =arr.length;
            }else{
                rb[i] = st.peek();
            }
            st.push(i);
        }

        /** 2. NSETL is the array of indexes for respective elements**/
        int[] lb = new int[arr.length];//nse index on left is left boundry
        st = new Stack<>();
        st.push(0);//last element
        lb[0]=-1;//set default
        for(int i= 1; i<arr.length;i++){
            while(st.size()>0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            if(st.size() ==0){
                lb[i] =-1;
            }else{
                lb[i] = st.peek();
            }
            st.push(i);
        }

        /** 3. calculate max area**/
        int maxArea =0;
        for(int i=0; i<arr.length;i++){
            int width = rb[i]-lb[i]-1;
            int length = arr[i];
            int area = length*width;
            if(area>maxArea){
                maxArea=area;
            }
        }
        System.out.println(maxArea);
    }
}
