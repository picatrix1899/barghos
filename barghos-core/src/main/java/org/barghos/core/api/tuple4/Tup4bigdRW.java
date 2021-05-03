package org.barghos.core.api.tuple4;

import java.math.BigDecimal;

/**
 * This interface grants read and write access to any 4-dimensional big decimal tuple.
 * 
 * @author picatrix1899
 * 
 * @since 1.0.0.0
 */
public interface Tup4bigdRW extends Tup4bigdR, Tup4bigdW
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
	Tup4bigdRW set(Tup4bigdR t);
	
	@Override
	Tup4bigdRW set(BigDecimal value);
	
	@Override
	Tup4bigdRW set(BigDecimal x, BigDecimal y, BigDecimal z, BigDecimal w);
	
	@Override
	default Tup4bigdRW getNewInstance(Tup4bigdR t)
	{
		return getNewInstance(t.getX(), t.getY(), t.getZ(), t.getW());
	}
	
	@Override
	default Tup4bigdRW getNewInstance(BigDecimal value)
	{
		return getNewInstance(value, value, value, value);
	}
	
	@Override
	Tup4bigdRW getNewInstance(BigDecimal x, BigDecimal y, BigDecimal z, BigDecimal w);
}