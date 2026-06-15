// Last updated: 6/15/2026, 7:17:45 PM
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;

        int[]sayı = new int[10];
        int i = 0;

        while(x>=1){
            
            int a = x%10;
            x /= 10;
            sayı[i]= a;
            i++;
 
        }

        int left=0;
        int right= i-1;

        while(left<=right){
            if(sayı[left]!=sayı[right])
            return false;
            
            left++;
            right--;
        }
        return true;
        

    }
}