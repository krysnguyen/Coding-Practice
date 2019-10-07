class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int pop;
        int x_dup = x;
        while (x_dup > 0){
            pop = x_dup%10;
            x_dup = x_dup/10;
            rev = rev*10 + pop;
        }
        return (rev == x);
    }
}
