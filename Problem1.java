// Time Complexity :O(log(n)) each time dividing into n/2 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no

class Solution {
    public double myPow(double x, int n) {
        //base
        if(n==0)return 1.00;
        double result = myPow(x,n/2);
        if(n%2==0)
            return result * result;
        else{
            if(n>0) return result * result * x; 
            return result * result * (1/x);
        }
    }
}