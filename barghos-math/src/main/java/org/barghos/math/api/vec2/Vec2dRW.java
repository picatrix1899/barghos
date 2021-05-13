package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2dRW;

public interface Vec2dRW extends Vec2dR, Vec2dW, Tup2dRW
{
	@Override
	Vec2dRW setX(double x);
	
	@Override
	Vec2dRW setY(double y);
	
	@Override
	Vec2dRW set(Tup2dR t);
	
	@Override
	Vec2dRW set(double value);
	
	@Override
	Vec2dRW set(double x, double y);
	
	@Override
	default Vec2dRW getNewInstance(Tup2dR t)
	{
		return getNewInstance(t.getX(), t.getY());
	}
	
	@Override
	default Vec2dRW getNewInstance(double value)
	{
		return getNewInstance(value, value);
	}
	
	@Override
	Vec2dRW getNewInstance(double x, double y);
}
