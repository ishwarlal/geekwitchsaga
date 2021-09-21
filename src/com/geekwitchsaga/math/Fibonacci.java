package com.geekwitchsaga.math;
/**
 * 
 * @author Ishwar Lal
 * @since 22nd Sep 2021
 *
 */
public class Fibonacci {
	
	/**
	 * Get nth number of Fibonacci series
	 * 
	 * @param n
	 * @return
	 */
	public static Long getFibonacci(Integer n) {
		Double phi = (1 + Math.sqrt(5)) / 2;
		return (Long)Math.round(Math.pow(phi, n) / Math.sqrt(5));
	}
	

}
