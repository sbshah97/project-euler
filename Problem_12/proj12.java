public class proj12 {
    public static void main(String[] args) {
        System.out.println(getTriangle(500));
    }

    public static long getTriangle(long n) {
        long triangleDivisorCount = 0, i = 1;
        for (i = 1; triangleDivisorCount <= n; i++) {
            if (i % 2 == 0) {
                triangleDivisorCount = getDivisorCount(i / 2) * getDivisorCount(i + 1);

            } else {
                triangleDivisorCount = getDivisorCount(i) * getDivisorCount((i + 1) / 2);
            }
        }

        return i*(i-1)/2;
    }

    // returns number of divisors of num
    private static long getDivisorCount(long num) {
        int count = 0;

        // check if sqrt(num) is divisor
        if((long)Math.pow((long)Math.sqrt(num), 2) == num) {
            count += 1;
        }

        int i;
        for (i = 1; i*i < num; i++) {
            if (num % i == 0) {
                // Both i and n/i will be divisors
                count += 2;
            }
        }

        return count;
    }
}
