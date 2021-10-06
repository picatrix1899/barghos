package org.barghos.core.api.tuple;

/**
 * This interface grants read and write access to any N-dimensional float tuple.
 * 
 * @author picatrix1899
 */
public interface TupfRW extends TupfR, TupfW
{
	@Override
	TupfRW setByIndex(int index, float value);

	@Override
	default TupfRW set(TupfR t)
	{
		return (TupfRW) TupfW.super.set(t);
	}
	
	@Override
	default TupfRW set(float value)
	{
		return (TupfRW) TupfW.super.set(value);
	}
	
	@Override
	default TupfRW setArray(float... values)
	{
		return (TupfRW) TupfW.super.setArray(values);
	}
	
	@Override
	default TupfRW getNewInstance(TupfR t)
	{
		return (TupfRW) TupfR.super.getNewInstance(t);
	}
	
	@Override
	default TupfRW getNewInstance(float value)
	{
		return (TupfRW) TupfR.super.getNewInstance(value);
	}
	
	@Override
	TupfRW getNewInstanceFromArray(float... values);
}
