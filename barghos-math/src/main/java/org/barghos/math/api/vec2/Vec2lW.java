package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2lR;
import org.barghos.core.api.tuple2.Tup2lW;

public interface Vec2lW extends Tup2lW
{
	Vec2lW setX(long x);
	Vec2lW setY(long y);
	
	Vec2lW set(Tup2lR t);
	Vec2lW set(long value);
	Vec2lW set(long x, long y);
}
