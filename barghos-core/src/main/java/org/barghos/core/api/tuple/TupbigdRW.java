package org.barghos.core.api.tuple;

import java.math.BigDecimal;

/**
 * This interface grants read and write access to any N-dimensional big decimal tuple.
 * 
 * @author picatrix1899
 */
public interface TupbigdRW extends TupbigdR, TupbigdW
{
	@Override
	TupbigdRW setByIndex(int index, BigDecimal value);

	@Override
	default TupbigdRW set(TupbigdR t)
	{
		return (TupbigdRW) TupbigdW.super.set(t);
	}
	
	@Override
	default TupbigdRW set(BigDecimal value)
	{
		return (TupbigdRW) TupbigdW.super.set(value);
	}
	
	@Override
	default TupbigdRW setArray(BigDecimal... values)
	{
		return (TupbigdRW) TupbigdW.super.setArray(values);
	}
	
	@Override
	default TupbigdRW getNewInstance(TupbigdR t)
	{
		return (TupbigdRW) TupbigdR.super.getNewInstance(t);
	}
	
	@Override
	default TupbigdRW getNewInstance(BigDecimal value)
	{
		return (TupbigdRW) TupbigdR.super.getNewInstance(value);
	}
	
	@Override
	TupbigdRW getNewInstanceFromArray(BigDecimal... values);
}
