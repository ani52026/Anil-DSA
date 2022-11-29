package Pattern;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for ( int i=0; i<n; i++ ){

            for (int j =0; j<n; j++)
            {
                System.out.print((char)('A' + j ));
            }
            System.out.println(" ");
        }
    }
}

