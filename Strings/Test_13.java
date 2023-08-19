class Test_13 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("Pi value is ");
        sb.append(3.14);
        sb.append(" It is exactly ");
        sb.append(true);
        System.out.println(sb);

        StringBuffer sb1 = new StringBuffer("Tussu mera naam hai");
        sb1.insert(6, "Babu ");
        System.out.println(sb1.length());
        System.err.println(sb1.capacity());
        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("Mussu");
        System.out.println(sb2.delete(2, 4));

        StringBuffer sb3 = new StringBuffer("Tussu");
        System.out.println(sb3.deleteCharAt(2));

        StringBuffer sb4 = new StringBuffer("Vussu");
        System.out.println(sb4.reverse());

        StringBuffer sb5 = new StringBuffer("Tarun");
        System.out.println(sb5);
        sb5.setLength(3);
        System.out.println(sb5);

        StringBuffer sb6 = new StringBuffer();
        System.out.println(sb6.capacity());
        sb6.ensureCapacity(50);
        System.out.println(sb6.capacity());
        sb6.trimToSize();
        System.out.println(sb6.capacity());

    }
}