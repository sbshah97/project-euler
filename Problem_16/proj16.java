
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger ans = BigInteger.ONE.add(BigInteger.ONE);
        ans = ans.pow(1000);
        String s = String.valueOf(ans);
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            res += s.charAt(i)-'0';
        }
        System.out.println(res);
    }
}

