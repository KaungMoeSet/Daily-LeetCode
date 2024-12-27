public class MergeStringsAlternately {

    private static String mergeAlternately(String word1, String word2) {
        StringBuffer result = new StringBuffer();
        while (word1.length() > 0 || word2.length() > 0) {
            if (word1.length() > 0) {
                result.append(word1.charAt(0));
                word1 = word1.substring(1);
            }
            if (word2.length() > 0) {
                result.append(word2.charAt(0));
                word2 = word2.substring(1);
            }
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        System.out.println("Merged string: " + mergeAlternately(word1, word2));
    }
}
