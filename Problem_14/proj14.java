
public class Main {
    private static int N = 1000000;
    private static long[] d = new long[N];
    public static long collatz(long i) {
        if(i == 1) return 1;
        if(i < N) {
           if(d[(int)i] != -1) {
                return d[(int)i];
            }
            else {
                if(i % 2 == 0) return (d[(int)i]=1+collatz(i/2));
                else return (d[(int)i]=1+collatz(3*i+1));
            }
        } else {
            if(i % 2 == 0) return 1+collatz(i/2);
            else return 1+collatz(3*i+1);
        }
    }

    public static void main(String[] args) {
        long ans = 1;
        for(int i = 0; i < N; i++) d[i] = -1;
        for(int i = 1; i < N; i++) {
            if(collatz(ans) < collatz(i)) {
                ans = i;
            }
        }
        System.out.println(ans);
    }
}

