import java.util.Scanner;

public class printKPCrecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printKPC(str,"");
    }
    //declare a global variable
    static String[] codes ={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKPC(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);//6
        String ros = ques.substring(1);//78

        //String codeforch = codes[ch];
        //now since ch'6' is a character itd value will not be 6 rather ascii 54 so subtract it from ch'0'
        String codeForCh = codes[ch-'0'];
        for(int i =0;i<codeForCh.length();i++){
            char option = codeForCh.charAt(i);
            printKPC(ros,ans + option);
        }
    }
}
