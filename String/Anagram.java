package String;

public class Anagram {

    public static void anagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("Not anagram");
            return;
        }
        int CHAR = 256;
        int count[] = new int[CHAR];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i = 0; i < CHAR; i++) {
            if (count[i] != 0) {
                System.out.println("Not anagram");
                return;
            }
        }
    }

    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";
        anagram(str1, str2);
    }
}