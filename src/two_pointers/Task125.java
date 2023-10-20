package two_pointers;

/*
*
*Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

*
*
* */
public class Task125 {

    public static void main(String[] args) {
        String s = ".a.a";
        System.out.println(isPalindrome(s));
    }


    public static boolean isPalindrome(String s) {

        String string = s.toLowerCase().trim();
        if (string.length() == 0 || string.length() == 1) {
            return true;
        }

        int len = string.length();

        int i = 0;
        int j = len - 1;

        while (i < j) {

            if (!Character.isLetterOrDigit(string.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(string.charAt(j))) {
                j--;
                continue;
            }

            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;

    }


//    public static boolean isPalindrome(String s) {
//
//        String string = s.trim().toLowerCase();
//        if (string.length()==0 || string.length()==1){
//            return true;
//        }
//
//        int len = string.length();
//        int k = 0;
//        int i = 0;
//        int j = len -1;
//        while (k <= string.length()/2){
//
//            if (!Character.isLetterOrDigit(string.charAt(i))){
//                i++;
//                continue;
//            }
//            if (!Character.isLetterOrDigit(string.charAt(j))){
//                j--;
//                continue;
//            }
//            if (string.charAt(i) != string.charAt(j)){return false;}
//            i++;
//            j--;
//            k++;
//        }
//        return true;
//    }
}
