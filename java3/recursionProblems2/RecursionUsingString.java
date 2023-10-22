package java3.recursionProblems2;

public class RecursionUsingString {
    public static void main(String[] args) {
        String s = "aabaa";
        System.out.println(isPalindrome(s));
        printAllSubsets(s);
//       countOccurrences(aa,s);
    }
    static boolean isPalindrome(String s) {
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    static boolean isPalindromeHelper(String s, int l, int r) {
        if (l >= r) {
            return true;
        } else {
            return s.charAt(l) == s.charAt(r) ? isPalindromeHelper(s, l + 1, r - 1) : false;
        }
    }

    static int countOccurrences(String t, String s) {
        return countOccurrencesHelper(t, s, 0);
    }

    static int countOccurrencesHelper(String t, String s, int i) {
        if (i > s.length() - t.length()) {
            return 0;
        } else {
            int subProblemKaAnswer = countOccurrencesHelper(t, s, i + 1);
            boolean doStartingCharsMatch = s.substring(i, i + t.length()).equals(t);
            return doStartingCharsMatch ? subProblemKaAnswer + 1 : subProblemKaAnswer;
        }
    }
    static void printAllSubsets(String s) {
        printAllSubsetsHelper(s, 0, "");
    }

    static void printAllSubsetsHelper(String s, int i, String cur) {
        if (i == s.length()) {
            System.out.println(cur);
        } else {
            printAllSubsetsHelper(s, i + 1, cur + s.charAt(i));
            printAllSubsetsHelper(s, i + 1, cur);
        }
    }

}

