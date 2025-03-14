import java.util.ArrayList;
import java.util.Scanner;

public class getAllSubsequenceRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        //catch the result of the function in a ArrayList of string type
        ArrayList<String> list = gss(str);
        System.out.println(list);
    }
    //create a function that returns result in ArrayList of string type
    public static ArrayList<String> gss(String str){
        //4. do a dry run of the below code and add base case
        //if str becomes empty still it will return a arraylist with space only
        if(str.length() ==0){
            ArrayList<String>bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }
        //1.separate the 1st element and the rest element of the string to use recursion
        char ch = str.charAt(0);
        String ros = str.substring(1);
        //2.take a faith on recursion result of ros and store it in a arraylist
        ArrayList<String> rres = gss(ros);
        //3.create a new arraylist to store the expected result and keep it empty to fill results
        ArrayList<String> mres = new ArrayList<>();
        //mres => ""+ all  elements of rres & ch+all elements of rres so run a for loop in rres
        for(int i=0; i<rres.size(); i++){
            mres.add(" "+rres.get(i));
        }
        for(int i=0; i<rres.size(); i++){
            mres.add(ch + rres.get(i));
        }
        return mres;
    }
}
