package pe.edu.unmsm.fisi.upg.ads.big_o_notation_java;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

//Complexity: O(2^N)
public class Exponential {

	public static void main(String[] args) {
		long N = 80;
		Exponential exponential = new Exponential();
		Stopwatch stopwatch = Stopwatch.createStarted();
		
		for (int i = 0; i <= N; i++) {
			long fibonacci = exponential.fibonacci_best(i);
		System.out.println(i+"=>"+fibonacci);
			/*
			try {
				long fibonacci = exponential.fibonacci(i);
				System.out.println(i + " => " + fibonacci);
			} catch (Exception e) {
				e.printStackTrace();
			}*/
		}
		System.out.println();
		System.out.println(String.format("Time elapsed: %d seconds", stopwatch.elapsed(TimeUnit.SECONDS)) + "\n");
	}
	
	public long fibonacci(int n) throws Exception {
        if (n < 0) {
            throw new Exception("N can not be less than zero");
        }
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
	}
	/*version mejorada */
	public long fibonacci_best(long n) {
		
		long a=0; long b=1; long c;
		for (int i=0;i<n;i++){
			c=a+b;
			a=b;
			b=c;
		}
		return a;
	}
}
