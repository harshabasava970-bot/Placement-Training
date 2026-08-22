import java.util.Scanner;

class Day_12_7 {

    static int binarySearch(int[] a, int low, int high, int key) {

        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (a[mid] == key)
            return mid;

        if (key < a[mid])
            return binarySearch(a, low, mid - 1, key);

        return binarySearch(a, mid + 1, high, key);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int key = sc.nextInt();

        int result = binarySearch(a, 0, n - 1, key);

        System.out.println(result);
    }
}
