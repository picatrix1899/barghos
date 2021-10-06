package org.barghos.core.api.tuple;

/**
 * This interface grants read and write access to any N-dimensional byte tuple.
 * 
 * @author picatrix1899
 */
public interface TupbRW extends TupbR, TupbW
{
	@Override
	TupbRW setByIndex(int index, byte value);

	@Override
	default TupbRW set(TupbR t)
	{
		return (TupbRW) TupbW.super.set(t);
	}
	
	@Override
	default TupbRW set(byte value)
	{
		return (TupbRW) TupbW.super.set(value);
	}
	
	@Override
	default TupbRW setArray(byte... values)
	{
		return (TupbRW) TupbW.super.setArray(values);
	}
	
	@Override
	default TupbRW getNewInstance(TupbR t)
	{
		return (TupbRW) TupbR.super.getNewInstance(t);
	}
	
	@Override
	default TupbRW getNewInstance(byte value)
	{
		return (TupbRW) TupbR.super.getNewInstance(value);
	}
	
	@Override
	TupbRW getNewInstanceFromArray(byte... values);
}
