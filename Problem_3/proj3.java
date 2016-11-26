import java.util.*;
import java.lang.*;

class proj3{
	public static void main(String args[]) {
		//Declare the number
		double n = 1000, prime=0;
		int j = 0;
		double[] arr = new double[100];

		//Algorithm for finding the factors
		for(int i = 2 ; i <= n/2 ; i++) {
			if(n % i == 0) {
				arr[j] = i;
				j++;
			}
		}

		//Algorithm for finding prime
		for(int i = 0 ; i < j ; i ++) {
			for(int k = 2 ; k <= Math.sqrt(arr[i]) ; k ++) {
				if(arr[i] % k == 0) {
					break;
				}
				else if(arr[i] % Math.sqrt(arr[i]) != 0)
					prime = arr[i];
			}
		}
	
		for(int i = 0 ; i < j ; i ++)
			System.out.println(prime);
	} 
}