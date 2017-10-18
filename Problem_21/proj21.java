import java.util.*;
import java.io.*;

public class proj21 {
	public static int divsum(int n) {
		int result = 0;

		for (int i=2; i<=Math.sqrt(n); i++) {
			if (n%i == 0) {
				if (i == n/i)
					result += i;
				else
					result += i + n/i;
			}
		}
		
		return result + 1;
	}

	public static void main(String[] args) {
		int b, sum = 0;
		for (int i = 1; i<10000; i++) {
			b = divsum(i);
			if (b>i && divsum(b)==i) sum += i + b;
		}	

		System.out.println(sum);
	}
}