import java.util.*;
import java.lang.*;

class proj4 {
	public static boolean isPrime(int n) {
		if(n == 2)
			return true;
    //check if n is a multiple of 2
    	if (n % 2 == 0) 
    		return false;
    //if not, then just check the odds
    	for(int i = 3 ; i*i <= n ; i += 2) {
        	if(n % i == 0)
            	return false;
    }
    return true;
}

	public static void main(String args[]) {
		int n = 1, i = 2;
		while(n < 10002) {
			if(isPrime(i)) {
				System.out.println(i);
				n++;
			}

			i++;
		}


	}
}