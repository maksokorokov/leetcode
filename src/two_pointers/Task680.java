package two_pointers;

/*
* Given a string s, return true if the s can be palindrome after deleting at most one character from it.
Example 1:
Input: s = "aba"
Output: true
Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:
Input: s = "abc"
Output: false
*
* */
public class Task680 {

    public static void main(String[] args) {

        String s = "abca";
        System.out.println(validPalindrome(s));
//        System.out.println(false || true);

        System.out.println();
    }


    public static boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            char c = s.charAt(i);
            char c1 = s.charAt(j);

            if (c==c1){
                i++;
                j--;
            } else {
                int i1 = i++;
                int j1 = j--;
                while (i1<j1){
                    char t = s.charAt(i1);
                    char t1 = s.charAt(j1);
                    if (t!=t1){
                        return false;
                    }
                    i1++;
                    j1--;
                }
            }
        }
        return true;
    }

}
