public class Test11 {
    public static void main(String[] args) {
        byte[] b = { 97, 98, 99, 100 };
        char[] ch = { 't', 'u', 's', 's', 'u' };
        // **Constructors of String class
        StringBuffer sbf = new StringBuffer("Hussu");
        StringBuilder sbd = new StringBuilder("Mussu");
        String s = new String(b);
        String s1 = new String(ch);
        String s2 = new String(sbf);
        String s3 = new String(sbd);
        String s4 = new String("Tushar");

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
