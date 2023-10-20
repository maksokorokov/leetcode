package arrays_and_hashing;



/*
* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
*  typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*
* */
public class Task242 {


    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));

    }


    public static boolean isAnagram(String s, String t) {

        if (s.equals(t)){
            return true;
        }
        if (s.length() != t.length()){
            return false;
        }

        StringBuilder stringBuilderS = new StringBuilder(s);
        StringBuilder stringBuilderT = new StringBuilder(t);

        for (int i = 0; i < stringBuilderS.length(); i++) {
            char c = stringBuilderS.charAt(i);
            String charString = Character.toString(c);
            int indexCharT = stringBuilderT.indexOf(charString);
            if (indexCharT < 0){
                return false;
            }
            stringBuilderT.deleteCharAt(indexCharT);
        }
        return true;
    }

//    оптимальное решение

    public static boolean isAnagram2(String s, String t){

        if (s.length() != t.length()) return false;

        //массив со всеми буквами в англ языке
        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }
        for (int n : store) if (n != 0) return false;

        return true;
    }
}
