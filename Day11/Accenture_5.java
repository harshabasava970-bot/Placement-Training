import java.util.*;

class Accenture_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String s = sc.nextLine().replace("{", "").replace("}", "").replace(",", " ");
        String[] a = s.trim().split("\\s+");

        int ans = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (Integer.parseInt(a[i]) == Integer.parseInt(a[j]))
                    count++;
            }

            if (count > n / 2) {
                ans = Integer.parseInt(a[i]);
                break;
            }
        }

        System.out.println(ans);
    }
}
