import java.util.Arrays;

public class LCSmemo1 {
    public static int lcsmemo(String x, String y) {
        int m = x.length(), n = y.length();
        int[][] memo = new int[m + 1][n + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return dp(x, y, m, n, memo);
    }

    private static int dp(String x, String y, int i, int j, int[][] memo) {
        if (i == 0 || j == 0) {
            return 0;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        if (x.charAt(i - 1) == y.charAt(j - 1)) {
            memo[i][j] = 1 + dp(x, y, i - 1, j - 1, memo);
        } else {
            memo[i][j] = Math.max(dp(x, y, i - 1, j, memo), dp(x, y, i, j - 1, memo));
        }
        return memo[i][j];
    }

    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        int lcsLength = lcsmemo(s1, s2);
        System.out.println("Length of LCS is: " + lcsLength);
    }
}