import java.util.ArrayList;
import java.util.Scanner;

public class getKeypadCombinationRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str  = scn.next();
        //catch the result of the kpc function in a arraylist
        ArrayList<String> words = kpc(str);
        System.out.println(words);
    }
    //we need to create a global array for given characters map
    //it is an array of string
    static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    //create a function of return type ArrayList of string
    public static ArrayList<String> kpc(String st){
        //5. now lets create the base case
        if(st.length() == 0){
            //create a new arraylist and add space to it
            ArrayList<String>empty = new ArrayList<>();
            empty.add(" ");
            return empty;
        }
        //1. separate 1st char and rest substring of the input string //179
        char ch = st.charAt(0);//1st char //1
        ///now this ch i.e 1 is a character 1 or'1' that have a ascii value of 49
        /// '1'!=1, character 1 value is not 1
        /// to get the value of char 1 as 1 we need to minus char 0 i.e 48
        /// char'0' =48, char'1' =49, to get no. 1 from char'1', we need char'1'-char'0'

        String ros = st.substring(1);//rest of string other than 1st char //79
        //2.take a fath of recursion on ros and store it in arraylist
        ArrayList<String>fres = kpc(ros);//79 -> [...]
        //3.now create another arraylist to store the my expected res
        ArrayList<String>eres = new ArrayList<>();//179 -> [...]

        //4.get each character of ch i.e 1 - abc && combine each of them with faith result (fres)
        //1 = codes[0][i]
        for(int i=0; i<codes[ch-'0'].length(); i++){
            for(int j=0; j<fres.size(); j++){
                eres.add(codes[ch-'0'].charAt(i)+fres.get(j));
            }
        }
        return eres;
    }
}
