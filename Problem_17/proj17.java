
public class Main {
    private static int[][] A = new int[20][20];
    public static String[] ones =
            { "","one","two","three","four","five","six","seven","eight","nine","ten",
                    "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};

    public static String[] tens =
            {"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};

    public static String[] hundreds =
            {"","onehundred","twohundred","threehundred","fourhundred","fivehundred","sixhundred",
                    "sevenhundred","eighthundred","ninehundred"};

    public static String get(int i)
    {
        String res = "";
        if(i == 1000) return "onethousand";
        if(i < 20) return ones[i];
        if(i < 100) return tens[i/10] + get(i%10);
        res = get(i%100);

        if(res.length() > 0)
            res = "and" + res;

        return hundreds[i/100]+res;
    }

    public static void main(String[] args) {
        int ans = 0;
        for(int i = 1; i < 1001; i++) {
            ans += get(i).length();
        }

        System.out.println(ans);
    }
}
