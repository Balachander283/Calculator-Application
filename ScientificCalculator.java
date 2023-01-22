package com.java.Calculators;

public class ScientificCalculator {
	public static final double PI = 3.14159;
	private double holdvalue;
	
	public final double exp(double x) {
		return Math.exp(x);
	}
	
	public final double log(double x) {
		return Math.log(x);
	}
	
	public final void putValueInMemory(double x) {
		holdvalue = x;
	}
	
	public final double getValuefromMemory() {
		return(holdvalue);
	}
}
