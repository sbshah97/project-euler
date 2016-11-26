import java.util.*;
import java.lang.*;

class proj10 {

	public static int isPrime (int num) {
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) 
            	return 0;
        return num;
	}

	public static void main(String args[]) {
		double n = 2000000;
		double sum = 2;

		for(int num = 3; num < n ; num+=2)  
			sum += isPrime(num);

		System.out.println(sum);
	}
} 