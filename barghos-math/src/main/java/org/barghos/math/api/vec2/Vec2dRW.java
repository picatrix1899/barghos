package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2dR;
import org.barghos.core.api.tuple2.Tup2dRW;

public interface Vec2dRW extends Vec2dR, Vec2dW, Tup2dRW
{
	Vec2dRW setX(double x);
	Vec2dRW setY(double y);
	
	Vec2dRW set(Tup2dR t);
	Vec2dRW set(double value);
	Vec2dRW set(double x, double y);
}
