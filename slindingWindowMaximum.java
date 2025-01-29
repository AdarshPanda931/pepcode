import java.util.Scanner;
import java.util.Stack;

public class slindingWindowMaximum {
    public static void main(String[] args){  //
        Scanner scn=new Scanner(System.in);
        System.out.println("enter size of input array: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        System.out.println("input array is: ");
        for(int i=0; i<arr.length; i++){    //[2,9,8,1,7,12]
            arr[i]= scn.nextInt();
        }

        /**1st find the NGETR array**/      /**left to right method**/
        int[]ngr=new int[arr.length];       //ngr[]
        Stack<Integer>sk=new Stack<>();     //st<>
        sk.push(0);                    //st<0(2)>
        for(int i =1;i<arr.length;i++){              //i=1, arr[1]=9
            while(sk.size()>0 && arr[i]>arr[sk.peek()]){  //st.peek=0,arr[0]=2,9>2
                ngr[sk.peek()] = arr[i];                          //ngr[9]
                sk.pop();
            }
            sk.push(i);               //push every thing
        }
        while(sk.size()>0){ //if anything left then pop then put -1, we have to show the nge of larger element is outside the window
            ngr[sk.peek()]=arr.length;        //so in place of -1, put a really large value like infinity ot arr.length
            sk.pop();
        }

        /**1st find the NGETR array**/       /**right to left method**/
        int[]nge = new int[arr.length];
        Stack<Integer>st = new Stack<>();
        st.push(arr.length-1);
        nge[arr.length-1] = arr.length;   //in place of -1 we put greater number like infinity or arr.length
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                nge[arr.length-1]=arr.length;
            }else{
                nge[i]=st.peek();
            }
            st.push(i);
        }

        /**slinding window**/
        int j =0;
        //k is window size
        System.out.println("enter the window size");
        int k = scn.nextInt();                   //window size
        System.out.println("sliding window max is: ");
        for(int i=0;i<=arr.length-k;i++){        //loop till arr.length-k coz last window will start at length-k
            //enter the loop to find the maximum of window starting at i
            if(j<i){ //some where if j left behind when moving to next window
                j=i; //bring j to i
            }
            while(nge[j]< i+k){  //i+k is the end point of the window
                j=nge[j];        //if ngetr of j is inside the window then jump j to that element
            }
            System.out.print(arr[j]+" "); //at last when ngtr is outside the window print the present j it is greatest in that window
        }
    }
}
