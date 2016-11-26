import java.util.*;
import java.lang.*;

class efib {
	public static void main(String args[]) {
		double[] arr = new double[100];
		double j = 0;
		arr[0] = 0;
		arr[1] = 1;

		for(int i = 2 ; i < 34 ; i ++) {
			arr[i] = arr[i-1] + arr[i-2];
			if(arr[i] % 2 == 0) {
				j += arr[i];
			}
		}
		System.out.println(j);
	}
}