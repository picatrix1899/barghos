package org.barghos.math.api.vec2;

import org.barghos.core.api.tuple2.Tup2lR;
import org.barghos.core.api.tuple2.Tup2lRW;

public interface Vec2lRW extends Vec2lR, Vec2lW, Tup2lRW
{
	Vec2lRW setX(long x);
	Vec2lRW setY(long y);
	
	Vec2lRW set(Tup2lR t);
	Vec2lRW set(long value);
	Vec2lRW set(long x, long y);
}
