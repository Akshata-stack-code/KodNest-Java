
class StringMethods {

    public static void main(String[] args) {
        String str = "KodNest Technologies";
        System.out.println(str); // KodNest Technologies
        System.out.println(str.toLowerCase()); // kodnest technologies
        System.out.println(str.toUpperCase()); // KODNEST TECHNOLOGIES
        System.out.println(str.charAt(3));// N
        // System.out.println(str.charAt(99)); // Throws StringIndexOutOfBoundsException: Index 99 out of bounds for length 20
        System.out.println(str.contains("Nest"));// true
        System.out.println(str.contains("nest"));
        System.out.println(str.startsWith("Kod"));
        System.out.println(str.startsWith("Nest"));
        System.out.println(str.endsWith("ies"));
        System.out.println(str.endsWith("kod"));
        System.out.println(str.indexOf('K'));
        System.out.println(str.indexOf('e'));
        System.out.println(str.length());
        System.out.println(str.replace('e', 'A'));
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 14));

    }
}
