// Last updated: 6/15/2026, 7:17:34 PM
import java.math.BigInteger;
class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1))
        return "";

        int gcdLength = BigInteger.valueOf(str1.length()).gcd(BigInteger.valueOf(str2.length())).intValue();

        return str1.substring(0, gcdLength);
    }
}