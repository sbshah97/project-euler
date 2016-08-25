import java.util.*;
import java.lang.*;

class proj6 {
	public static void main(String args[]) {
		int n = 100, sum;
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 1 ; i <= n ; i ++) {
			sum1 += i*i;
		}

		for(int  i = 1 ; i <= n ; i ++) {
			sum2 += i;
		}

		sum = sum2*sum2 - sum1;
		System.out.println(sum);
	}
}