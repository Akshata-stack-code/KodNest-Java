
class StringBuilder1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//0
        sb.append("Java");
        System.out.println(sb);
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//4
        sb.append(" is a Programming Language");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("and object oriented");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

    }
}
