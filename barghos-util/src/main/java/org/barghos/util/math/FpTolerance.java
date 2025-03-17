package org.barghos.util.math;

public enum FpTolerance 
{
	EM8(1.e-8),
	EM6(1.e-6),
	EM4(1.e-4);
	
	private final double valueD;
	private final float valueF;
	
	private FpTolerance(double value)
	{
		this.valueD = value;
		this.valueF = (float)value;
	}
	
	public double valD()
	{
		return this.valueD;
	}
	
	public float valF()
	{
		return this.valueF;
	}
	
}
