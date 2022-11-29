import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1= 0;
        int n2=1;
        int i;
        for(i =0 ;i<n;i=n1+n2) {
            n1 = n2;
            n2 = i;
        }
        System.out.println(i);
        if(n1==n)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }



    }
}
