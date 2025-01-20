import java.util.Scanner;
import java.util.Stack;

public class balancedBrackets {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch =='['){
                st.push(ch);
            }else if(ch == ')'){                       //check closing bracket separately
                if(st.size()== 0){
                    System.out.println("false");
                    return;//this is important, we always forgets to stop analysing the code after we get a false result
                }else if(st.peek()!= '('){
                    System.out.println("false");
                    return;
                }else{
                    st.pop();
                }
            }else if (ch=='}'){
                if(st.size()== 0){
                    System.out.println("false");
                    return;
                }else if(st.peek()!= '}'){
                    System.out.println("false");
                    return;
                }else{
                    st.pop();
                }

            }else if(ch==']'){
                if(st.size()== 0){
                    System.out.println("false");
                    return;
                }else if(st.peek()!= ']'){
                    System.out.println("false");
                    return;
                }else{
                    st.pop();
                }
            }
        }
        if(st.size() > 0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }

    }
}
