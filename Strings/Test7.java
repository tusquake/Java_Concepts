public class Test7 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());// 16
        System.out.println(sb.length());// 0

        sb.append("hello");
        System.out.println(sb.capacity());// 16
        System.out.println(sb.length());// 5

        sb.append("hello Tushar");
        System.out.println(sb.capacity());// 34 (oldcap*2+2)
        System.out.println(sb.length());// 17
    }
}
