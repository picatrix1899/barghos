package org.barghos.core.api.tuple;

import java.math.BigInteger;

/**
 * This interface grants read and write access to any N-dimensional big integer tuple.
 * 
 * @author picatrix1899
 */
public interface TupbigiRW extends TupbigiR, TupbigiW
{
	@Override
	TupbigiRW setByIndex(int index, BigInteger value);

	@Override
	default TupbigiRW set(TupbigiR t)
	{
		return (TupbigiRW) TupbigiW.super.set(t);
	}
	
	@Override
	default TupbigiRW set(BigInteger value)
	{
		return (TupbigiRW) TupbigiW.super.set(value);
	}
	
	@Override
	default TupbigiRW setArray(BigInteger... values)
	{
		return (TupbigiRW) TupbigiW.super.setArray(values);
	}
	
	@Override
	default TupbigiRW getNewInstance(TupbigiR t)
	{
		return (TupbigiRW) TupbigiR.super.getNewInstance(t);
	}
	
	@Override
	default TupbigiRW getNewInstance(BigInteger value)
	{
		return (TupbigiRW) TupbigiR.super.getNewInstance(value);
	}
	
	@Override
	TupbigiRW getNewInstanceFromArray(BigInteger... values);
}
