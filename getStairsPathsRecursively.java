import java.util.ArrayList;
import java.util.Scanner;

public class getStairsPathsRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String>paths = gsp(n);
        System.out.println(paths);
    }
    public static ArrayList<String> gsp(int n){
        //atlast base case
        if(n==0){
            ArrayList<String>bres = new ArrayList<>();
            bres.add(" ");
            return bres;
        }else if(n<0){
            ArrayList<String>bres = new ArrayList<>();
            return bres;
        }
        //array list to store faith
        ArrayList<String>nm1 = gsp(n-1);
        ArrayList<String>nm2 = gsp(n-2);
        ArrayList<String>nm3 = gsp(n-3);
        //new array list to store expected res, keep it blank to add res
        ArrayList<String> eres = new ArrayList<>();
        for(int i=0; i<nm1.size(); i++){
            eres.add("1"+nm1.get(i));
        }
        for(int i=0; i<nm2.size(); i++){
            eres.add(2+nm2.get(i));
        }
        for(int i=0; i<nm3.size(); i++){
            eres.add(3+nm3.get(i));
        }
        return eres;
        //return null;
    }
}
