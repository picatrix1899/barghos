package org.barghos.core.api.tuple4;

import java.math.BigDecimal;

import org.barghos.core.api.tuple.TupbigdR;
import org.barghos.core.api.tuple.TupbigdRW;

/**
 * This interface grants read and write access to any 4-dimensional big decimal tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4bigdRW extends Tup4bigdR, Tup4bigdW, TupbigdRW
{
	@Override
	Tup4bigdRW setX(BigDecimal x);
	
	@Override
	Tup4bigdRW setY(BigDecimal y);
	
	@Override
	Tup4bigdRW setZ(BigDecimal z);
	
	@Override
	Tup4bigdRW setW(BigDecimal w);
	
	@Override
	default Tup4bigdRW set(Tup4bigdR t)
	{
		return (Tup4bigdRW)Tup4bigdW.super.set(t);
	}
	
	@Override
	default Tup4bigdRW set(BigDecimal value)
	{
		return (Tup4bigdRW)Tup4bigdW.super.set(value);
	}
	
	@Override
	default Tup4bigdRW set(BigDecimal x, BigDecimal y, BigDecimal z, BigDecimal w)
	{
		return (Tup4bigdRW)Tup4bigdW.super.set(x, y, z, w);
	}

	@Override
	default Tup4bigdRW getNewInstance(Tup4bigdR t)
	{
		return (Tup4bigdRW)Tup4bigdR.super.getNewInstance(t);
	}
	
	@Override
	default Tup4bigdRW getNewInstance(BigDecimal value)
	{
		return (Tup4bigdRW)Tup4bigdR.super.getNewInstance(value);
	}
	
	@Override
	Tup4bigdRW getNewInstance(BigDecimal x, BigDecimal y, BigDecimal z, BigDecimal w);
	
	@Override
	default int getDimensions()
	{
		return Tup4bigdR.super.getDimensions();
	}
	
	@Override
	default Tup4bigdRW getNewInstanceFromArray(BigDecimal... values)
	{
		return (Tup4bigdRW)Tup4bigdR.super.getNewInstanceFromArray(values);
	}
	
	@Override
	default Tup4bigdRW setByIndex(int index, BigDecimal value)
	{
		return (Tup4bigdRW)Tup4bigdW.super.setByIndex(index, value);
	}
	
	@Override
	default Tup4bigdRW setArray(BigDecimal... values)
	{
		return (Tup4bigdRW)Tup4bigdW.super.setArray(values);
	}
	
	@Override
	default Tup4bigdRW set(TupbigdR t)
	{
		return (Tup4bigdRW)Tup4bigdW.super.set(t);
	}
	
	@Override
	default Tup4bigdRW getNewInstance(TupbigdR t)
	{
		return (Tup4bigdRW)Tup4bigdR.super.getNewInstance(t);
	}
}