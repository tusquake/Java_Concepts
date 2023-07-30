public class Test8 {
    public static void main(String[] args) {
        String s = "Tushar";
        StringBuffer s1 = new StringBuffer(s);
        System.out.println(s.concat(" Seth"));// Tushar Seth
        System.out.println(s1.append(" Seth"));// Tushar Seth
        System.out.println(s.length());// 6
        System.out.println(s1.length());// 11

    }
}
