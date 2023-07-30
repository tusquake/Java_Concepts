public class Test9 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Tushar Seth");
        StringBuffer sb2 = new StringBuffer("Tushar Seth");
        StringBuffer sb3 = sb1.append(" java");
        System.out.println(sb1.equals(sb2));// false
        System.out.println(sb1.equals(sb3));// true
        System.out.println(sb1 == sb2);// false
        System.out.println(sb1 == sb3);// true

    }
}
