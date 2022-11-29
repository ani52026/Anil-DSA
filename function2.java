import java.util.Scanner;

public class function2 {
    public static int factorial(int n) {
        int num = 1;
        for(int i=1; i<=n; i++)
        {
            num = num*i;
        }
        return num;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
      int answer = factorial(n);
        System.out.println(answer);


    }

}
