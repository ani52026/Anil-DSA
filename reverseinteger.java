public class reverseinteger {
    public static void main(String[] args){

        int a=123;
        int rem;
        while(a!=0)
        {
            rem=a%10;
            a=a/10;
            System.out.print(rem);
        }

    }
}

