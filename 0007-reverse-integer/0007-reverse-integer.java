class Solution {
    public int reverse(int x) {
        if (x >= -9 && x <= 9) {
            return x;
        }
        if (x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) {
            return 0;
        }
        int symbol = x < 0 ? -1 : 1;
        x = Math.abs(x);
        int total = 0;
        while (x > 0) {
            int digit = x % 10;
            if (total > Integer.MAX_VALUE / 10
                    || (total == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            total = total * 10 + digit;
            x /= 10;
        }
        return symbol * total;
    }
}
