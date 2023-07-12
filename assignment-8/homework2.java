class Solution {
    public boolean checkValidString(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
 
        int lo = 0;
        int hi = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
 
            if (c == '(') {
                lo++;
                hi++;
            } else if (c == ')') {
                if (lo > 0) {
                    lo--;
                }
                hi--;
            } else {
                if (lo > 0) {
                    lo--;
                }
                hi++;
            }
 
            if (hi < 0) {
                return false;
            }
        }
 
        return lo == 0;
    }
}