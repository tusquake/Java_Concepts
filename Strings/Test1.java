public class Test1 {
    public static void main(String[] args) {
        String s = "TUSHAr";
        String s1 = "TushAR";
        String x = "madam", y = "mam";
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.equals(s1));
        System.out.println(s.compareTo(s1));
        System.out.println(s.compareToIgnoreCase(s1));
        System.out.println(x.compareTo(y));
        System.out.println(y.compareTo(x));
        System.out.println(x.compareToIgnoreCase(y));
    }
}
