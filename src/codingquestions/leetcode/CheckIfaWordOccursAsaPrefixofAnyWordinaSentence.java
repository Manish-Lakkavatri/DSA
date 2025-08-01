package codingquestions.leetcode;

/**
 * 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
 * Solved
 * Easy
 * Topics
 * Companies
 * Hint
 * Given a sentence that consists of some words separated by a single space, and a searchWord, check if searchWord is a prefix of any word in sentence.
 * <p>
 * Return the index of the word in sentence (1-indexed) where searchWord is a prefix of this word. If searchWord is a prefix of more than one word, return the index of the first word (minimum index). If there is no such word return -1.
 * <p>
 * A prefix of a string s is any leading contiguous substring of s.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: sentence = "i love eating burger", searchWord = "burg"
 * Output: 4
 * Explanation: "burg" is prefix of "burger" which is the 4th word in the sentence.
 * Example 2:
 * <p>
 * Input: sentence = "this problem is an easy problem", searchWord = "pro"
 * Output: 2
 * Explanation: "pro" is prefix of "problem" which is the 2nd and the 6th word in the sentence, but we return 2 as it's the minimal index.
 * Example 3:
 * <p>
 * Input: sentence = "i am tired", searchWord = "you"
 * Output: -1
 * Explanation: "you" is not a prefix of any word in the sentence.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= sentence.length <= 100
 * 1 <= searchWord.length <= 10
 * sentence consists of lowercase English letters and spaces.
 * searchWord consists of lowercase English letters.
 */

public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {

    public int isPrefixOfWord(String sentence, String searchWord) {

        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            if (s[i].startsWith(searchWord)) return i + 1;
        }

        return -1;

    }

}
