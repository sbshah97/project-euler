import java.util.Arrays;

public class Main {
    private static int N = 21;
    private static long[][] d = new long[N][N];
    public static boolean valid(int i, int j) {
        if(i < 0 || j < 0 || i >= N || j >= N) return false;
        return true;
    }

    public static long solve(int i, int j) {
        if(!valid(i, j)) return 0;
        if(i == 0 && j == 0) return 1;
        if(d[i][j] != -1) return d[i][j];
        return (d[i][j]=solve(i-1, j)+solve(i, j-1));
    }

    public static void main(String[] args) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                d[i][j] = -1;
            }
        }
        System.out.println(solve(N-1, N-1));
    }
}
