package org.barghos.core.api.tuple;

/**
 * This interface grants read and write access to any N-dimensional string tuple.
 * 
 * @author picatrix1899
 */
public interface TupstrRW extends TupstrR, TupstrW
{
	@Override
	TupstrRW setByIndex(int index, String value);

	@Override
	default TupstrRW set(TupstrR t)
	{
		return (TupstrRW) TupstrW.super.set(t);
	}
	
	@Override
	default TupstrRW set(String value)
	{
		return (TupstrRW) TupstrW.super.set(value);
	}
	
	@Override
	default TupstrRW setArray(String... values)
	{
		return (TupstrRW) TupstrW.super.setArray(values);
	}
	
	@Override
	default TupstrRW getNewInstance(TupstrR t)
	{
		return (TupstrRW) TupstrR.super.getNewInstance(t);
	}
	
	@Override
	default TupstrRW getNewInstance(String value)
	{
		return (TupstrRW) TupstrR.super.getNewInstance(value);
	}
	
	@Override
	TupstrRW getNewInstanceFromArray(String... values);
}
