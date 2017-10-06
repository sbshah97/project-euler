
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        int ans = 0;
        BigInteger b = BigInteger.ONE;
        for(int i = 1; i < 101; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }

        String s = String.valueOf(b);
        for(int i = 0; i < s.length(); i++) {
            ans += (s.charAt(i)-'0');
        }

        System.out.println(ans);
    }
}

