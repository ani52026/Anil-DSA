package Pattern;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for ( int i=0; i<n; i++ ){

            for (int j =0; j<= i; j++)

            {
                System.out.print((char)('A' +  j ));
            }
            System.out.println(" ");
        }
    }
}
