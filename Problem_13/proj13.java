
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < 100; i++) {
            BigInteger b = in.nextBigInteger();
            ans = ans.add(b);
        }

        System.out.println(String.valueOf(ans).substring(0, 10));
    }
}

