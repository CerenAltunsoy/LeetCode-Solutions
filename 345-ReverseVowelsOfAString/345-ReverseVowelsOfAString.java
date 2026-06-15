// Last updated: 6/15/2026, 7:17:37 PM
class Solution {
    public String reverseVowels(String s) {
        char[] word = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length()-1;

        while(start < end){

            while(start < end && vowels.indexOf(word[start]) == -1){
                start++;
            }

            while(start < end && vowels.indexOf(word[end]) == -1){
                end--;
            }

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;
            start++;
            end--;
        }

        String reverse = new String(word);
        return reverse;
    }
}