public class Test {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 4 };
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        try {
            System.out.println(arr[5]);
        }
        // catch (Exception e) {
        // System.out.println(e);
        // }
        finally {
            System.out.println("Chala do!");
            System.out.println("6");
            System.out.println("7");

        }
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");

    }
}
