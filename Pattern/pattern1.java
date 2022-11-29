package Pattern;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
       // int i=1;
       for ( int i=1; i<=n; i++ ){

           for (int j =n; j>=i; j--){
               System.out.print(" @ ");
           }
           System.out.println(" ");
       }
    }
}
