public class Test14 {
    public static void main(String[] args) {
        // *Method Chaining */
        StringBuilder sd = new StringBuilder();
        System.out.println(
                sd.append("Tushar is a good").reverse().insert(11, "very").delete(3, 7).length());
    }
}
