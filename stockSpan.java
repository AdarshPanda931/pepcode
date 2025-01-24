import java.util.Scanner;
import java.util.Stack;

public class stockSpan {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length;i++){//arr[2,5,3,12,6,8,7]
            arr[i]=scn.nextInt();
        }
        //make a span array to store ans and a stack to perform operation
        int[] span = new int[arr.length];
        Stack<Integer>st = new Stack<>();
        span[0]=1;                                       //span[1]
        st.push(0);                                 //st[0]
        for(int i=1; i<arr.length; i++){                 //i=1,arr[i]=5,st[0]               //i=2,arr[2]=3,st[1] //i=3,arr[3]=12
            while(st.size()!=0 && arr[st.peek()]<arr[i]){//st.peek()=0,arr[0]=2,2<5✅       //st.peek()=1,5<3❌ //st.peek()=2,3<12✅,pop2
                st.pop();                                //st[]                                                 //st[1],peek=1,5<12✅,pop1
            }                                                                                                   //st[]
            if(st.size()==0){                            //st[]✅                           //st[1]             //st[]✅
                span[i]=i+1;                             //span[1]=2                                            //span[3]=3+1=4
            }else{                                       //span[1,2]                        //✅                //span[1,2,1,4]
                span[i]=i-st.peek();                                                        //span[2]=2-1=1
            }                                                                               //span[1,2,1]
            st.push(i);                                  //st[1]                            //st[1,2]           //st[3]
        }
        for(int i=0;i<arr.length; i++){
            System.out.println(span[i]);
        }
    }
}
