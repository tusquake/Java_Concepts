public class Test_12 {
    public static void main(String[] args) {
        String s1 = "tussu";
        String s2 = s1.toString();// *no change to existing string */
        String s3 = s1.toLowerCase();
        String s4 = s1.toUpperCase(); // *all new objects are only created in heap area and not in the string constant
                                      // *pool */

        System.out.println(s1 == s2); // *true */
        System.out.println(s1 == s3); // *true */
        System.out.println(s1 == s4); // *false */
    }
}