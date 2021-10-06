package org.barghos.core.api.tuple;

/**
 * This interface grants read and write access to any N-dimensional char tuple.
 * 
 * @author picatrix1899
 */
public interface TupcRW extends TupcR, TupcW
{
	@Override
	TupcRW setByIndex(int index, char value);

	@Override
	default TupcRW set(TupcR t)
	{
		return (TupcRW) TupcW.super.set(t);
	}
	
	@Override
	default TupcRW set(char value)
	{
		return (TupcRW) TupcW.super.set(value);
	}
	
	@Override
	default TupcRW setArray(char... values)
	{
		return (TupcRW) TupcW.super.setArray(values);
	}
	
	@Override
	default TupcRW getNewInstance(TupcR t)
	{
		return (TupcRW) TupcR.super.getNewInstance(t);
	}
	
	@Override
	default TupcRW getNewInstance(char value)
	{
		return (TupcRW) TupcR.super.getNewInstance(value);
	}
	
	@Override
	TupcRW getNewInstanceFromArray(char... values);
}
