import java.util.*;
import java.lang.*;

class multiples {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 1 ; i < 1000 ; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum += i;
				//System.out.println(sum);
			}
		}

		System.out.println(sum);
	}
}