import java.util.*;
public class MyFirstProgram {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String name = scn.nextLine();
        System.out.println("hii "+ name);

        int n = scn.nextInt();
        for(int i=0; i<=n; i++){
            System.out.println(i);
        }

        int k = scn.nextInt();


        System.out.print("Hello World 1");
        System.out.println("Hello World 2");
        System.out.print("Hello World 3\n");
        System.out.println("Hello World 4");
        System.out.println("*\n*\n***\n****\n*****");
        for(int i =1; i<=5;i++){
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("*****\n   *\n  *\n *\n*****");
/*conditional statements*/
        int n1 =20;
        int n2 = 30;
        if(n1 == n2){
            System.out.println(n1 + " is equal to" + n2);
        }else{
            if(n1 > n2){
                System.out.println(n1 + " is greater than" + n2);
            }else{
                System.out.println(n1 + " is smaller than" + n2);
            }
        }
        /*2nd method*/
        if(n1 == n2){
            System.out.println(n1 + " is equal to " + n2);
        }else if(n1 > n2){
            System.out.println(n1 + " is greater than " + n2);
        }else {
            System.out.println(n1 + " is smaller than " + n2);
        }
        /*loops*/
        int i =1;
        while(i<9){
            System.out.println(i);
            i++;
        }
        for(int j=0; j<9; j++){
            System.out.println(j);
        }
    }
}
