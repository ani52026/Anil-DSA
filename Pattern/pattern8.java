package Pattern;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n)
        {
            int j=1;
            while (j<=n)
            {
                System.out.print("*");
                j++;
            }

            i++;
            System.out.println();

        }
    }
}
