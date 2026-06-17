// User function Template for Java
import java.math.BigInteger;

class Solution {
    String findSum(String s1, String s2) {
        // code here
        BigInteger num1 = new BigInteger(s1);
        BigInteger num2 = new BigInteger(s2);
        
        BigInteger res = num1.add(num2);
        
        return res.toString();
    }
}