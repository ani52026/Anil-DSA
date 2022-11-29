import java.util.Scanner;

public class facter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i;
        int sum = 0;
        for (i = 1; i <= 12; i++)
        {
            if (n % i == 0)
            {
                sum = sum + 1;
            }

        }
        System.out.println(sum);

        for (i = 1; i <= 12; i++)
        {
            if (n % i == 0)
                System.out.println(i);


        }


    }
}
