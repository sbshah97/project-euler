
public class Main {
    // https://en.wikipedia.org/wiki/Zeller%27s_congruence
    public static int zullerCongruence(int day, int month, int year) {
        if(month == 1) {
            month = 13;
            year--;
        }

        if(month == 2) {
            month = 14;
            year--;
        }

        int q = day;
        int m = month;
        int k = year % 100;
        int j = year / 100;
        int h = q + 13*(m+1)/5 + k + k/4 + j/4 + 5*j;
        h = h % 7;
        return h;
    }

    public static void main(String[] args) {
        int ans = 0;
        for (int year = 1901; year <= 2000; year++) {
            for (int month = 1; month <= 12; month++) {
                if(zullerCongruence(1, month, year) == 1) {
                    ++ans;
                }
            }
        }

        System.out.println(ans);
    }
}

