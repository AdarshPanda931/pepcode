import java.util.Scanner;

public class printPermutationRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        pp(str,"");
    }
    public static void pp(String ques, String asf){
        //base case afetr running the for loop if ques length =0 print ans
        if(ques.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i=0;i<ques.length();i++){
            String left = ques.substring(0,i);
            char ch = ques.charAt(i);
            String right = ques.substring(i+1);
            pp(left+right, asf+ ch);
        }
    }
}
