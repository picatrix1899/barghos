package org.barghos.math.api.vec2;

import java.math.BigDecimal;

import org.barghos.core.api.tuple2.Tup2bigdR;
import org.barghos.core.api.tuple2.Tup2bigdRW;

public interface Vec2bigdRW extends Vec2bigdR, Vec2bigdW, Tup2bigdRW
{
	@Override
	Vec2bigdRW setX(BigDecimal x);
	
	@Override
	Vec2bigdRW setY(BigDecimal y);
	
	@Override
	Vec2bigdRW set(Tup2bigdR t);
	
	@Override
	Vec2bigdRW set(BigDecimal value);
	
	@Override
	Vec2bigdRW set(BigDecimal x, BigDecimal y);
	
	@Override
	default Vec2bigdRW getNewInstance(Tup2bigdR t)
	{
		return getNewInstance(t.getX(), t.getY());
	}
	
	@Override
	default Vec2bigdRW getNewInstance(BigDecimal value)
	{
		return getNewInstance(value, value);
	}
	
	@Override
	Vec2bigdRW getNewInstance(BigDecimal x, BigDecimal y);
}
