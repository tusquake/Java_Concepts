class Test10 {
    public static void main(String[] args) {
        String s = new String("Tussu");
        String s1 = new String("Tussu");
        System.out.println(s == s1);
        System.out.println(s.equals(s1));// *In String the equals method is overridden which we get from the object
                                         // *class */

        System.out.println("_____________________________________");

        StringBuffer s3 = new StringBuffer("Tussu");
        StringBuffer s4 = new StringBuffer("Tussu");

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4)); // *In String buffer the equals method is not overridden which we get from
                                           // *the object class */
    }
}