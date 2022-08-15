package folders.stringMethods;

public class StringExample {

    public static void main(String[] args) {

        String a = "ggyoman";
        String a1 = "gg";
        String a2 = new String("gg");

        System.out.println(a1.equals(a2));
        System.out.println(a.startsWith("gg"));
        System.out.println(a.endsWith("mav"));
        System.out.println(a.contains("d"));

        System.out.println("3");

        char c = a.charAt(3);
        System.out.println(c);

        char[] charArray = a.toCharArray();
        for (int l = 0; l < charArray.length; l++) {
            System.out.println(charArray[l]);
        }

    }
}
