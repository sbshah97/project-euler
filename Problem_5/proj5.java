import java.util.*;
import java.lang.*;

class proj5 {
	public static void main(String args[]) {
		//Variable declaration
		int n = 10;
		int lowMul = 0;

		/**
		* The given algorithm is as follows:
		* 1. Add a number to the existing lowest multiple
		* which is checked till the current 'i'
		* 2. Check if the remainder comes out to be zero
		* 3. If not, then add the value of the current 'i' 
		* to the lowest Multiple and check again. 
		*/
		for(int i = 2 ; i < 5 ; i ++) {//i = 1	
			do {
				lowMul += i;	

			}while(lowMul % i !=  0);
		} 

		System.out.println(lowMul);
	}
}