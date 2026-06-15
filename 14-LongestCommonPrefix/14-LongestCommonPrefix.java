// Last updated: 6/15/2026, 7:17:43 PM

class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        var s1 = strs[0];
        var s2 = strs[strs.length-1];

        var idx = 0;

        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx))
            ++idx;
            else
             break;
        }
        return s1.substring(0,idx);
    }
}