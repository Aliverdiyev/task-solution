package strings;

public class S2 {
    public static void main(String[] args) {
//        bir kelimenin tersten okunuşunu kontrol eden bir program yazın
        S2 text = new S2();
        String m2 = "tenet";
        String m3 = "tenep";
        System.out.println(text.isPalindrome(m2));
        System.out.println(text.isPalindrome(m3));
    }

    boolean isPalindrome(String m2) {
        int i = 0, j = m2.length() - 1;
        while (i < j) {
            if (m2.charAt(i) != m2.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}