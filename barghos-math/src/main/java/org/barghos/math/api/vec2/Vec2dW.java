package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2dW;

public interface Vec2dW extends Tup2dW
{
	Vec2dW setX(double x);
	Vec2dW setY(double y);
	
	Vec2dW set(Tup2dR t);
	Vec2dW set(double value);
	Vec2dW set(double x, double y);
}
