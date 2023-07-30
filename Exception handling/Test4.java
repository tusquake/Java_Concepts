public class Test4 {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        }
        // catch (ArithmeticException ae) {
        // System.out.println(ae);
        // }
        catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("I am in finally Block");
        }
    }
}
