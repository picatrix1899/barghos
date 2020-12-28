package org.barghos.core.util;


public enum ScaleUnit
{
	PETA	(1000000000000.0),
	GIGA	(1000000000.0),
	MEGA	(1000000.0),
	KILO	(1000.0),
	HECTO	(100.0),
	DECA	(10.0),
	NORMAL	(1.0),
	DECI	(0.1),
	ZENTI	(0.01),
	MILLI	(0.001),
	MICRO	(0.000001),
	NANO	(0.000000001),
	PICO	(0.000000000001),
	FEMTO	(0.000000000000001)
	;
	
	private double factor;
	
	private ScaleUnit(double factor)
	{
		this.factor = factor;
	}
	
	public double getFactor()
	{
		return this.factor;
	}
	
	public double convertToNormal(double value)
	{
		return value * factor;
	}
	
	public double convertTo(double value, ScaleUnit unit)
	{
		return value * factor / unit.getFactor();
	}
}
