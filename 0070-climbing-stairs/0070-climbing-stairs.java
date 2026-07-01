class Solution {
    public int climbStairs(int n) {
        return (int) fib(n + 1)[0];
    }
    public long[] fib(int n) {
        if (n == 0) {
            return new long[]{0, 1};
        }

        long[] p = fib(n / 2);
        long a = p[0];
        long b = p[1];

        long c = a * (2 * b - a);
        long d = a * a + b * b;

        if (n % 2 == 0) {
            return new long[]{c, d};
        } else {
            return new long[]{d, c + d};
        }
    }
}