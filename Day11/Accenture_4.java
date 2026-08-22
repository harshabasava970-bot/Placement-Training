import java.util.*;

class Accenture_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int ans = 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < i; j++)
                if (a[i] > a[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);

        for (int x : dp)
            ans = Math.max(ans, x);

        System.out.println(ans);
    }
}
