package org.barghos.core.api.tuple;

/**
 * This interface grants read and write access to any N-dimensional object tuple.
 * 
 * @author picatrix1899
 */
public interface TupobjRW extends TupobjR, TupobjW
{
	@Override
	TupobjRW setByIndex(int index, Object value);

	@Override
	default TupobjRW set(TupobjR t)
	{
		return (TupobjRW) TupobjW.super.set(t);
	}
	
	@Override
	default TupobjRW set(Object value)
	{
		return (TupobjRW) TupobjW.super.set(value);
	}
	
	@Override
	default TupobjRW setArray(Object... values)
	{
		return (TupobjRW) TupobjW.super.setArray(values);
	}
	
	@Override
	default TupobjRW getNewInstance(TupobjR t)
	{
		return (TupobjRW) TupobjR.super.getNewInstance(t);
	}
	
	@Override
	default TupobjRW getNewInstance(Object value)
	{
		return (TupobjRW) TupobjR.super.getNewInstance(value);
	}
	
	@Override
	TupobjRW getNewInstanceFromArray(Object... values);
}
