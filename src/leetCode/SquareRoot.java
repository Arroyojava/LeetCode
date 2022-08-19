package leetCode;

public class SquareRoot {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 49;
        int num3 = 8;

        System.out.println(mySqrt(num1));
        System.out.println(mySqrt(num2));
        System.out.println(mySqrt(num3));

    }

    public static int mySqrt(int x) {
        if (x == 0) return 0;
        int start = 1, end = x, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid <= x / mid) {
                ans = mid;
                start = mid + 1;
            } else
                end = mid - 1;
        }

        return ans;
    }
}
