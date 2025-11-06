package anbu.oops;

public class StringPoolDemo {
    public static void main(String[] args){
        String s1 = "Anbu";
        String s2 = "Anbu";
        String s3= new String("Anbu");

        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s3));
    }
}
