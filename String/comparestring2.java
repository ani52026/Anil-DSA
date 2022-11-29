package String;

public class comparestring2 {
    public static void main(String[] args) {
        String a= new String("Kunal");
        String b= new String("Kunal");
       // we make new object for both String so both a and b pointing different object
        System.out.println(a==b);
        //method to print character of stirng
        System.out.println(a.charAt(0));
    }
}
