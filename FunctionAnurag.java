import java.util.Scanner;

public class FunctionAnurag {
    public static int factorial(int n) {
       int ans=1;
       for(int i=1; i<=n;i++)
       {
           ans = ans * i;
       }
       return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        int num = factorial(n);
        int det1 = factorial(r);
        int det2 = factorial(n-r);
        int ans = num/(det1*det2);
        System.out.println(ans);
    }
}
