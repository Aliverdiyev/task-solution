package practise;

public class S1 {
    public static void main(String[] args) {
//        Belirli bir karakterin bir metin içinde kaç defa geçtiğini bulan bir program yazın.
        String m = "saaaaaalaaaaam";
        char someChar = 'a';
        int count = 0;
        for (int i = 0; i < m.length(); i++) {
            if (m.charAt(i) == someChar) {
                count++;
            }
        }
        System.out.println(count);
    }
}