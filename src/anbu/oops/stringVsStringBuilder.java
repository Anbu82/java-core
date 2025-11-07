package anbu.oops;

public class stringVsStringBuilder {
    public static void main(String[] args){
        //---------String Example--------
        String str = "Anbu";
        System.out.println("Initial String value:" + str);
        System.out.println("String object identity :"+ System.identityHashCode(str));

        //Modify the String
        str = str +"R";
        System.out.println("After modification:" +str);
        System.out.println("String object identity(new one):"+ System.identityHashCode(str));

        //---------------StringBuilder Example---------------
        StringBuilder sb = new StringBuilder("Anbu");
        System.out.println("/nInitial StringBuilder value:" +sb);
        System.out.println("StringBuilder object Identity:" +System.identityHashCode(sb));

        // Modify the StringBuilder (same object modified)
        sb.append("R");
        System.out.println("After modification: " + sb);
        System.out.println("StringBuilder object identity (same one): " + System.identityHashCode(sb));

        // -------- StringBuffer Example --------
        StringBuffer sbf = new StringBuffer("Anbu");
        System.out.println("\nInitial StringBuffer value: " + sbf);
        System.out.println("StringBuffer object identity: " + System.identityHashCode(sbf));

        sbf.append("R"); // modifies same object, thread-safe
        System.out.println("After modification: " + sbf);
        System.out.println("StringBuffer object identity (same one): " + System.identityHashCode(sbf));
    }


}
