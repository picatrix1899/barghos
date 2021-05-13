package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2dW;

public interface Vec2dW extends Tup2dW
{
	@Override
	Vec2dW setX(double x);
	
	@Override
	Vec2dW setY(double y);
	
	@Override
	Vec2dW set(Tup2dR t);
	
	@Override
	Vec2dW set(double value);
	
	@Override
	Vec2dW set(double x, double y);
}
