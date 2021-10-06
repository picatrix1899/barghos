package org.barghos.core.api.tuple;

/**
 * This interface grants read and write access to any N-dimensional double tuple.
 * 
 * @author picatrix1899
 */
public interface TupdRW extends TupdR, TupdW
{
	@Override
	TupdRW setByIndex(int index, double value);

	@Override
	default TupdRW set(TupdR t)
	{
		return (TupdRW) TupdW.super.set(t);
	}
	
	@Override
	default TupdRW set(double value)
	{
		return (TupdRW) TupdW.super.set(value);
	}
	
	@Override
	default TupdRW setArray(double... values)
	{
		return (TupdRW) TupdW.super.setArray(values);
	}
	
	@Override
	default TupdRW getNewInstance(TupdR t)
	{
		return (TupdRW) TupdR.super.getNewInstance(t);
	}
	
	@Override
	default TupdRW getNewInstance(double value)
	{
		return (TupdRW) TupdR.super.getNewInstance(value);
	}
	
	@Override
	TupdRW getNewInstanceFromArray(double... values);
}
