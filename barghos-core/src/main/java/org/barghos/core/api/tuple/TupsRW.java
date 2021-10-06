package org.barghos.core.api.tuple;

/**
 * This interface grants read and write access to any N-dimensional short tuple.
 * 
 * @author picatrix1899
 */
public interface TupsRW extends TupsR, TupsW
{
	@Override
	TupsRW setByIndex(int index, short value);

	@Override
	default TupsRW set(TupsR t)
	{
		return (TupsRW) TupsW.super.set(t);
	}
	
	@Override
	default TupsRW set(short value)
	{
		return (TupsRW) TupsW.super.set(value);
	}
	
	@Override
	default TupsRW setArray(short... values)
	{
		return (TupsRW) TupsW.super.setArray(values);
	}
	
	@Override
	default TupsRW getNewInstance(TupsR t)
	{
		return (TupsRW) TupsR.super.getNewInstance(t);
	}
	
	@Override
	default TupsRW getNewInstance(short value)
	{
		return (TupsRW) TupsR.super.getNewInstance(value);
	}
	
	@Override
	TupsRW getNewInstanceFromArray(short... values);
}
