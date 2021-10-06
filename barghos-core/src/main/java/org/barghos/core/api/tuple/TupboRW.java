package org.barghos.core.api.tuple;

/**
 * This interface grants read and write access to any N-dimensional boolean tuple.
 * 
 * @author picatrix1899
 */
public interface TupboRW extends TupboR, TupboW
{
	@Override
	TupboRW setByIndex(int index, boolean value);

	@Override
	default TupboRW set(TupboR t)
	{
		return (TupboRW) TupboW.super.set(t);
	}
	
	@Override
	default TupboRW set(boolean value)
	{
		return (TupboRW) TupboW.super.set(value);
	}
	
	@Override
	default TupboRW setArray(boolean... values)
	{
		return (TupboRW) TupboW.super.setArray(values);
	}
	
	@Override
	default TupboRW getNewInstance(TupboR t)
	{
		return (TupboRW) TupboR.super.getNewInstance(t);
	}
	
	@Override
	default TupboRW getNewInstance(boolean value)
	{
		return (TupboRW) TupboR.super.getNewInstance(value);
	}
	
	@Override
	TupboRW getNewInstanceFromArray(boolean... values);
}
