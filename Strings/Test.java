class Test {
    public static void main(String[] args) {
        String s1 = new String("tussu");
        String s2 = new String("tussu");
        String s3 = "tussu";
        String s4 = "tussu";
        System.out.print(s1 == s2);
        System.out.print(s1 == s3);
        System.out.print(s3 == s4);
        System.out.println();
        System.out.print(s1.equals(s2));
        System.out.print(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}