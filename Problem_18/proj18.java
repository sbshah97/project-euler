import java.util.Scanner;

public class Main {
    private static int[][] A = new int[20][20];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int i = 1; i < 16; i++) {
            for(int j = 1; j <= i; j++) {
                A[i][j] = in.nextInt();
            }
        }

        int ans = 0;
        for(int i = 1; i < 16; i++) {
            for(int j = 1; j <= i; j++) {
                A[i][j] = A[i][j]+Math.max(A[i-1][j-1], A[i-1][j]);
                ans = Math.max(ans, A[i][j]);
            }
        }


        System.out.println(ans);
    }
}
