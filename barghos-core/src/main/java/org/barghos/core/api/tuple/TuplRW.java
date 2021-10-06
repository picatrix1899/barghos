package org.barghos.core.api.tuple;

/**
 * This interface grants read and write access to any N-dimensional long tuple.
 * 
 * @author picatrix1899
 */
public interface TuplRW extends TuplR, TuplW
{
	@Override
	TuplRW setByIndex(int index, long value);

	@Override
	default TuplRW set(TuplR t)
	{
		return (TuplRW) TuplW.super.set(t);
	}
	
	@Override
	default TuplRW set(long value)
	{
		return (TuplRW) TuplW.super.set(value);
	}
	
	@Override
	default TuplRW setArray(long... values)
	{
		return (TuplRW) TuplW.super.setArray(values);
	}
	
	@Override
	default TuplRW getNewInstance(TuplR t)
	{
		return (TuplRW) TuplR.super.getNewInstance(t);
	}
	
	@Override
	default TuplRW getNewInstance(long value)
	{
		return (TuplRW) TuplR.super.getNewInstance(value);
	}
	
	@Override
	TuplRW getNewInstanceFromArray(long... values);
}
