package com.geekwitchsaga.math;

public class Fibonacci {
	
	
	public static Long getFibonacci(Integer n) {
		Double phi = (1 + Math.sqrt(5)) / 2;
		return (Long)Math.round(Math.pow(phi, n) / Math.sqrt(5));
	}
	

}
