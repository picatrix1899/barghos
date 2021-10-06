package org.barghos.core.api.tuple;

/**
 * This interface grants read and write access to any N-dimensional integer tuple.
 * 
 * @author picatrix1899
 */
public interface TupiRW extends TupiR, TupiW
{
	@Override
	TupiRW setByIndex(int index, int value);

	@Override
	default TupiRW set(TupiR t)
	{
		return (TupiRW) TupiW.super.set(t);
	}
	
	@Override
	default TupiRW set(int value)
	{
		return (TupiRW) TupiW.super.set(value);
	}
	
	@Override
	default TupiRW setArray(int... values)
	{
		return (TupiRW) TupiW.super.setArray(values);
	}
	
	@Override
	default TupiRW getNewInstance(TupiR t)
	{
		return (TupiRW) TupiR.super.getNewInstance(t);
	}
	
	@Override
	default TupiRW getNewInstance(int value)
	{
		return (TupiRW) TupiR.super.getNewInstance(value);
	}
	
	@Override
	TupiRW getNewInstanceFromArray(int... values);
}
