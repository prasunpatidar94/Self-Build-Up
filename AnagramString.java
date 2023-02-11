package design.test;

public class AnagramString {

    public static void main(String[] args) {

        String str1 = "mary", str2 = "army";
        System.out.println(isAnagram(str1, str2));

    }

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) return false;

        for (int i = 0; i <= str1.length() - 1; i++)
            if (!str2.contains("" + str1.charAt(i))) return false;

        return true;
    }
}
